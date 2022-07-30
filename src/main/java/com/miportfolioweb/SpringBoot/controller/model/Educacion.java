
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
public class Educacion {
     @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    private Long id;
  @Basic
    private String nivel;
    private String escuela;
    private String direccion;
    private String titulo;
    private String img;
    private String  desde;
    private String  hasta;

    public Educacion() {
    }

    public Educacion(Long id, String nivel, String escuela, String direccion, String titulo, String img, String desde, String hasta) {
        this.id = id;
        this.nivel = nivel;
        this.escuela = escuela;
        this.direccion = direccion;
        this.titulo = titulo;
        this.img = img;
        this.desde = desde;
        this.hasta = hasta;
    }
  @Override
  public String toString(){
      return "Educacion[" + "id" +id+ ",escuela:"+ escuela+",titulo: "+ desde +"hasta" + hasta;
  }
}
