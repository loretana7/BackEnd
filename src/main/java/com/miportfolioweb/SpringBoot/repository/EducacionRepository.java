
package com.miportfolioweb.SpringBoot.repository;
import com.miportfolioweb.SpringBoot.controller.model.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducacionRepository extends JpaRepository<Educacion,Long>{
    
}