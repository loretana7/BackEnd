
package com.miportfolioweb.SpringBoot.controller.service;

import com.miportfolioweb.SpringBoot.controller.model.Persona;
import java.util.List;


public interface IPersonaService {
   public List<Persona> verPersonas();
    public void crearPersona(Persona p);
    public void borrarPersona(Long id);
    public Persona buscarPersona(Long id);
    public void modificarPersona(Persona p); 
}
