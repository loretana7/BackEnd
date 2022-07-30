
package com.miportfolioweb.SpringBoot.controller.service;

import com.miportfolioweb.SpringBoot.controller.model.AcercaDe;
import java.util.List;


public interface IAcercaDeService {
  public List<AcercaDe>obtenerAcercaDe();
   public void crearAcercaDe(AcercaDe acercaDe);
   public void borrarAcercaDe(Long id);
   public AcercaDe obtenerAcercaDe(Long id);
   public void modificarAcercaDe(AcercaDe acercaDe);   
}
