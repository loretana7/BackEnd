
package com.miportfolioweb.SpringBoot.controller;

import com.miportfolioweb.SpringBoot.controller.model.Persona;
import com.miportfolioweb.SpringBoot.controller.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {
      @Autowired
   private IPersonaService persoServ;
     @PostMapping("/new/persona")
    public void AgregarPersona(@RequestBody Persona p){
      persoServ.crearPersona(p);//este cuando cree la base de datos
     
        
    }
    @GetMapping("/ver/personas")
    @ResponseBody
    public List<Persona> VerPersonas(){
       return persoServ.verPersonas(); 

    }
    @DeleteMapping("/delete/{id}")
    public void borrarPersona(@PathVariable Long id){
        persoServ.borrarPersona(id);
    }
    @GetMapping("/obtenerPersona/{id}")
    @ResponseBody
    public Persona buscarPersona(@PathVariable Long id){
       return persoServ.buscarPersona(id);
    }
    
    @PutMapping("/persona/update")
    public void modificarPersona(@RequestBody Persona persona){
        persoServ.modificarPersona(persona );
    } 
}
