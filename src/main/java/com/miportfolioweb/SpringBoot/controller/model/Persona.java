
package com.miportfolioweb.SpringBoot.controller.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    private Long id;
    
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;

    public Persona() {
    }

    public Persona(Long id, String nombre, String apellido, String telefono, String email) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
    }
  
    
}
