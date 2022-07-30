/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miportfolioweb.SpringBoot.controller.service;

import com.miportfolioweb.SpringBoot.controller.model.Habilidades;
import com.miportfolioweb.SpringBoot.controller.model.Persona;
import java.util.List;

/**
 *
 * @author tanit
 */
public interface IHabilidadesService {
     public List<Habilidades>obtenerHabilidades();
   public void crearHabilidades(Habilidades h);
   public void borrarHabilidad(Long id);
   public Habilidades obtenerHabilidad(Long id);
   public void modificarHabilidad(Habilidades h);
}
