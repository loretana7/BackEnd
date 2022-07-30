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
public class Experiencias {
        @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    private Long id;
  @Basic
    private String posicion;
    private String lugar;
    private String img;
    private String direccion;
    private String  horario;
     private String  desde;
    private String  hasta;

    public Experiencias() {
    }

    public Experiencias(Long id, String posicion, String lugar, String img, String direccion, String horario, String desde, String hasta) {
        this.id = id;
        this.posicion = posicion;
        this.lugar = lugar;
        this.img = img;
        this.direccion = direccion;
        this.horario = horario;
        this.desde = desde;
        this.hasta = hasta;
    }

}
