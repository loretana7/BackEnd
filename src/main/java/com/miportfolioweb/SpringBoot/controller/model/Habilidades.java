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
public class Habilidades {
            @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    private Long id;
  @Basic
    private String nombre;
    private int porcentaje;
    private String descripcion;

    public Habilidades() {
    }

    public Habilidades(Long id, String nombre, int porcentaje, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.porcentaje = porcentaje;
        this.descripcion = descripcion;
    }
  
}
