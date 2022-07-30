
package com.miportfolioweb.SpringBoot.controller;

import com.miportfolioweb.SpringBoot.controller.model.Educacion;
import com.miportfolioweb.SpringBoot.controller.service.EducacionService;
import java.util.ArrayList;
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
public class EducacionController {
    @Autowired
    public EducacionService service;

 @GetMapping("educacion/mostrar")
 @ResponseBody
 public List<Educacion> obtenerEducacion(){  
     return service.obtenerEducaciones();
 }
 @PostMapping("/educacion/crear")
 @ResponseBody
 public Educacion crearEducacion(@RequestBody Educacion educacion){
      return service.crearEducacion(educacion);
    }
 @DeleteMapping("/educacion/eliminar/{id}")
 public void borrarEducacion(@PathVariable Long id){
     service.borrarEducacion(id);
 }
 @GetMapping("/educacion/obtener/{id}")
 public Educacion obtenerEducacion(@PathVariable Long id){
     return service.obtenerEducacion(id);
 }
 @PutMapping("/educacion/modificar")
 @ResponseBody
 public void modificarEducacion(@RequestBody Educacion educacion){
     service.modificarEducacion(educacion);
 }

 
}
