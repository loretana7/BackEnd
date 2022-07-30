/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miportfolioweb.SpringBoot.controller;

import com.miportfolioweb.SpringBoot.controller.model.Experiencias;
import com.miportfolioweb.SpringBoot.controller.service.ExperienciaService;
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
public class ExperienciaController {
        @Autowired
    public ExperienciaService service;

 @GetMapping("experiencia/mostrar")
 @ResponseBody
 public List<Experiencias> obtenerExperiencia(){  
     return service.obtenerExperiencia();
 }
 @PostMapping("/experiencia/crear")
 public void crearExperiencia(@RequestBody Experiencias e){
      service.crearExperiencia(e);
    }
 @DeleteMapping("/experiencia/eliminar/{id}")
 public void borrarExperiencia(@PathVariable Long id){
     service.borrarExperiencia(id);
 }
 @GetMapping("/experiencia/obtener/{id}")
 public Experiencias obtenerExperiencia(@PathVariable Long id){
     return service.obtenerExperiencia(id);
 }
 @PutMapping("/experiencia/modificar")
 @ResponseBody
 public void modificarExperiencia(@RequestBody Experiencias e){
     service.modificarExperiencia(e);
 }

}
