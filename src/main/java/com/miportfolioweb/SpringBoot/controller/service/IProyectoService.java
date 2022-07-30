/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miportfolioweb.SpringBoot.controller.service;

import com.miportfolioweb.SpringBoot.controller.model.Proyectos;
import java.util.List;

/**
 *
 * @author tanit
 */
public interface IProyectoService {
     public List<Proyectos>obtenerProyectos();
   public Proyectos crearProyectos(Proyectos proyectos);
   public void borrarProyecto(Long id);
   public Proyectos obtenerProyectos(Long id);
   public void modificarProyecto(Proyectos p); 
}
