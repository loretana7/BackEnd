/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miportfolioweb.SpringBoot.controller.service;

import com.miportfolioweb.SpringBoot.controller.model.Proyectos;
import com.miportfolioweb.SpringBoot.repository.ProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService implements IProyectoService{
    @Autowired
public ProyectoRepository repository;
   
    @Override
    public List<Proyectos> obtenerProyectos() {
      return repository.findAll(); 
    }

    @Override
    public Proyectos crearProyectos(Proyectos proyectos) {
     return repository.save(proyectos);
    }

    @Override
    public void borrarProyecto(Long id) {
    repository.deleteById(id);
    }

    @Override
    public Proyectos obtenerProyectos(Long id) {
    return repository.findById(id).orElse(null);
    }

    @Override
    public void modificarProyecto(Proyectos p) {
    repository.save(p);
    }
    
}
