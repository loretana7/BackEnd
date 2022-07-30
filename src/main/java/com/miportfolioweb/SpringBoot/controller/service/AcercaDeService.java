/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miportfolioweb.SpringBoot.controller.service;

import com.miportfolioweb.SpringBoot.controller.model.AcercaDe;
import com.miportfolioweb.SpringBoot.repository.AcercaDeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class AcercaDeService implements IAcercaDeService{
    @Autowired
public AcercaDeRepository repository;
    @Override
    public List<AcercaDe> obtenerAcercaDe() {
     return repository.findAll();
    }

    @Override
    public void crearAcercaDe(AcercaDe acercaDe) {
   repository.save(acercaDe);
    }

    @Override
    public void borrarAcercaDe(Long id) {
     repository.deleteById(id);
    }

    @Override
    public AcercaDe obtenerAcercaDe(Long id) {
  return repository.findById(id).orElse(null);
    }

    @Override
    public void modificarAcercaDe(AcercaDe acercaDe) {
   repository.save(acercaDe);
    }
    
}
