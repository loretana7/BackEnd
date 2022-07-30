/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miportfolioweb.SpringBoot.repository;

import com.miportfolioweb.SpringBoot.controller.model.Experiencias;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author tanit
 */
public interface ExperienciaRepository extends JpaRepository<Experiencias,Long> {

    public List<Experiencias> findAll();
    
}
