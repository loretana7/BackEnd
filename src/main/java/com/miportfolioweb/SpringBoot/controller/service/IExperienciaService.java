/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miportfolioweb.SpringBoot.controller.service;

import com.miportfolioweb.SpringBoot.controller.model.Experiencias;
import java.util.List;

/**
 *
 * @author tanit
 */
public interface IExperienciaService {
    public List<Experiencias>obtenerExperiencia();
   public void crearExperiencia(Experiencias experiencia);
   public void borrarExperiencia(Long id);
   public Experiencias obtenerExperiencia(Long id);
   public void modificarExperiencia(Experiencias experiencia); 
}
