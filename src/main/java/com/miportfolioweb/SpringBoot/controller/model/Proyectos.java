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
public class Proyectos {
        @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    private Long id;
  @Basic
    private String nombre;
    private String descripcion;
    private String desde;
    private String hasta;
    private String img;

    public Proyectos() {
    }

    public Proyectos(Long id, String nombre, String descripcion, String desde, String hasta, String img) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.desde = desde;
        this.hasta = hasta;
        this.img = img;
    }

    @Override
    public String toString() {
        return "Proyectos{" + "id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", desde=" + desde + ", hasta=" + hasta + ", img=" + img + '}';
    }
    
    
  
}
