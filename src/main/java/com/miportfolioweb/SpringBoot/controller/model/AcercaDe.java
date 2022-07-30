/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miportfolioweb.SpringBoot.controller.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class AcercaDe {
    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    private Long id;
  @Basic
    private String apellido;
    private String nombre;
    private Integer edad;
    private String informacion;
    private String email;
    private String titulo;
    private String img;

    public AcercaDe() {
    }

    public AcercaDe(Long id, String apellido, String nombre, Integer edad, String informacion, String email, String titulo, String img) {
        this.id = id;
        this.apellido = apellido;
        this.nombre = nombre;
        this.edad = edad;
        this.informacion = informacion;
        this.email = email;
        this.titulo = titulo;
        this.img = img;
    }

    @Override
    public String toString() {
        return "AcercaDe{" + "id=" + id + ", apellido=" + apellido + ", nombre=" + nombre + ", edad=" + edad + ", informacion=" + informacion + ", email=" + email + ", titulo=" + titulo + ", img=" + img + '}';
    }


  
   
}
