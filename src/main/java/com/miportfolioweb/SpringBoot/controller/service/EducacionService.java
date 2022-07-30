
package com.miportfolioweb.SpringBoot.controller.service;

import com.miportfolioweb.SpringBoot.controller.model.Educacion;
import com.miportfolioweb.SpringBoot.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements IEducacionService{
    @Autowired
public EducacionRepository repository;
    @Override
    public List<Educacion> obtenerEducaciones() {
    return repository.findAll();
    }

    @Override
    public Educacion crearEducacion(Educacion educacion) {
   return repository.save(educacion);
    }

    @Override
    public void borrarEducacion(Long id) {
       repository.deleteById(id);
    }

    @Override
    public Educacion obtenerEducacion(Long id) {
  return repository.findById(id).orElse(null);
    }

    @Override
    public void modificarEducacion(Educacion educacion) {
     repository.save(educacion);
    }
    
}
