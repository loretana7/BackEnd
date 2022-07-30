
package com.miportfolioweb.SpringBoot.controller.service;

import com.miportfolioweb.SpringBoot.controller.model.Persona;
import com.miportfolioweb.SpringBoot.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService {

   @Autowired
public PersonaRepository persoRepo;
    @Override
    public List<Persona> verPersonas() {
     return persoRepo.findAll();
    }

    @Override
    public void crearPersona(Persona p) {
    persoRepo.save(p);
    }

    @Override
    public void borrarPersona(Long id) {
       persoRepo.deleteById(id);
    }

    @Override
    public Persona buscarPersona(Long id) {
   return  persoRepo.findById(id).orElse(null) ;
    }

    @Override
    public void modificarPersona(Persona p) {
    persoRepo.save(p);
    }
    
    
}
