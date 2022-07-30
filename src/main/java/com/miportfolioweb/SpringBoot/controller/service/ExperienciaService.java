/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miportfolioweb.SpringBoot.controller.service;

import com.miportfolioweb.SpringBoot.controller.model.Experiencias;
import com.miportfolioweb.SpringBoot.repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperienciaService{
    @Autowired
public ExperienciaRepository repository;
    @Override
    public List<Experiencias> obtenerExperiencia() {
    return repository.findAll();
    }

    @Override
    public void crearExperiencia(Experiencias experiencia) {
    repository.save(experiencia); 
    }

    @Override
    public void borrarExperiencia(Long id) {
   repository.deleteById(id);
    }

    @Override
    public Experiencias obtenerExperiencia(Long id) {
   return repository.findById(id).orElse(null);
    }

    @Override
    public void modificarExperiencia(Experiencias experiencia) {
   repository.save(experiencia);
    }
    
}
