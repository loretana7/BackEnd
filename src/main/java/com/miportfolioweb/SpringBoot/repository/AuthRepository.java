/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miportfolioweb.SpringBoot.repository;

import com.miportfolioweb.SpringBoot.controller.model.Usuario;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthRepository extends JpaRepository<Usuario,Long>{
   List<Usuario>findByEmailAndIsEnabledTrue(String email); 
 
}
