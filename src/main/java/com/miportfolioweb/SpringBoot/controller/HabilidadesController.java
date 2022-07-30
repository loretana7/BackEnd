/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miportfolioweb.SpringBoot.controller;
import com.miportfolioweb.SpringBoot.controller.model.Habilidades;
import com.miportfolioweb.SpringBoot.controller.service.HabilidadesService;
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
public class HabilidadesController {
       @Autowired
    public HabilidadesService service;

 @GetMapping("habilidad/mostrar")
 @ResponseBody
 public List<Habilidades> obtenerHabilidades(){  
     return service.obtenerHabilidades();
 }
 @PostMapping("/habilidad/crear")
 public void crearEducacion(@RequestBody Habilidades h){
      service.crearHabilidades(h);
    }
 @DeleteMapping("/habilidad/eliminar/{id}")
 public void borrarHabilidad(@PathVariable Long id){
     service.borrarHabilidad(id);
 }
 @GetMapping("/habilidad/obtener/{id}")
 public Habilidades obtenerHabilidad(@PathVariable Long id){
     return service.obtenerHabilidad(id);
 }
 @PutMapping("/habilidad/modificar")
 @ResponseBody
 public void modificarHabilidad(@RequestBody Habilidades h){
     service.modificarHabilidad(h);
 }

}
