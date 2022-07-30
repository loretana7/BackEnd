/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miportfolioweb.SpringBoot.controller;

import com.miportfolioweb.SpringBoot.controller.model.Proyectos;
import com.miportfolioweb.SpringBoot.controller.service.ProyectoService;
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
public class ProyectosController {
      @Autowired
    public ProyectoService service;
  @GetMapping("proyecto/mostrar")
 @ResponseBody
 public List<Proyectos> obtenerProyecto(){  
     return service.obtenerProyectos();
 }
 @PostMapping("/proyecto/crear")
 @ResponseBody
 public Proyectos crearProyectos(@RequestBody Proyectos p){
      return service.crearProyectos(p);
    }
 @DeleteMapping("/proyecto/eliminar/{id}")
 public void borrarProyecto(@PathVariable Long id){
     service.borrarProyecto(id);
 }
 @GetMapping("/proyecto/obtener/{id}")
 public Proyectos obtenerProyecto(@PathVariable Long id){
     return service.obtenerProyectos(id);
 }
 @PutMapping("/proyecto/modificar")
 @ResponseBody
 public void modificarProyecto(@RequestBody Proyectos p){
     service.modificarProyecto(p);
 }
}
