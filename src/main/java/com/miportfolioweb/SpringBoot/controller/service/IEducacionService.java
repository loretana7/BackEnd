
package com.miportfolioweb.SpringBoot.controller.service;

import com.miportfolioweb.SpringBoot.controller.model.Educacion;
import java.util.List;


public interface IEducacionService {
   public List<Educacion>obtenerEducaciones();
   public Educacion crearEducacion(Educacion educacion);
   public void borrarEducacion(Long id);
   public Educacion obtenerEducacion(Long id);
   public void modificarEducacion(Educacion educacion);
}
