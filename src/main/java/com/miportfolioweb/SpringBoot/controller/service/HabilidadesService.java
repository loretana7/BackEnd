/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miportfolioweb.SpringBoot.controller.service;

import com.miportfolioweb.SpringBoot.controller.model.Habilidades;
import com.miportfolioweb.SpringBoot.repository.HabilidadesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HabilidadesService implements IHabilidadesService {
    @Autowired
public HabilidadesRepository repository;

    @Override
    public List<Habilidades> obtenerHabilidades() {
    return repository.findAll();
    }

    @Override
    public void crearHabilidades(Habilidades h) {
    repository.save(h);
    }

    @Override
    public void borrarHabilidad(Long id) {
     repository.deleteById(id);
    }

    @Override
    public Habilidades obtenerHabilidad(Long id) {
    return repository.findById(id).orElse(null);
    }

    @Override
    public void modificarHabilidad(Habilidades h) {
    repository.save(h);
    }

   
}
