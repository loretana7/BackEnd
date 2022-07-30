
package com.miportfolioweb.SpringBoot.controller.service;
import com.miportfolioweb.SpringBoot.controller.model.Usuario;
import com.miportfolioweb.SpringBoot.controller.model.dto.UserDto;
import com.miportfolioweb.SpringBoot.repository.AuthRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class Authservice {
    @Autowired
     AuthRepository repository;
    @Autowired
    PasswordEncoder passwordEncoder;
   
    public boolean isUserEnabled(UserDto userDto){
      boolean isUserEnabled = false;
      List<Usuario> usuarios = repository.findByEmailAndIsEnabledTrue(userDto.getEmail());
if (!usuarios.isEmpty()){
    Usuario usuario = usuarios.get(0);
    if(passwordEncoder.matches(userDto.getPassword(), usuario.getPassword()))
        isUserEnabled = true;
}
      return isUserEnabled;
    }
   
    
  
    public void crearUsuario(Usuario usuario)throws Exception{
        List<Usuario> usuarios = repository.findByEmailAndIsEnabledTrue(usuario.getEmail());
        if (!usuarios.isEmpty()){
           
            throw new Exception("Este usuario ya existe");
        }else{
            
        
        usuario.setPassword(passwordEncoder.encode(usuario.getPassword()));
        usuario.setIsEnabled(true);
        repository.save(usuario);
       }
    }
}
