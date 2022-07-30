
package com.miportfolioweb.SpringBoot.controller;

import com.miportfolioweb.SpringBoot.controller.model.AcercaDe;
import com.miportfolioweb.SpringBoot.controller.service.AcercaDeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AcercaDeController {
       @Autowired
    public AcercaDeService service;

 @GetMapping("acercaDe/mostrar")
 @ResponseBody
 public List<AcercaDe> obtenerAcercaDe(){  
     return service.obtenerAcercaDe();
 }
 @PostMapping("/acercaDe/crear")
 public void crearAcercaDe(@RequestBody AcercaDe acercaDe){
      service.crearAcercaDe(acercaDe);
    }
 @DeleteMapping("/acercaDe/eliminar/{id}")
 public void borrarAcercaDe(@PathVariable Long id){
     service.borrarAcercaDe(id);
 }
 @GetMapping("/acercaDe/obtener/{id}")
 public AcercaDe obtenerAcercaDe(@PathVariable Long id){
     return service.obtenerAcercaDe(id);
 }
 @PutMapping("/acercaDe/modificar")
 @ResponseBody
 public void modificarAcercaDe(@RequestBody AcercaDe acercaDe){
     service.modificarAcercaDe(acercaDe);
 }

 
}
