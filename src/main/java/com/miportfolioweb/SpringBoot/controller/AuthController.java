
package com.miportfolioweb.SpringBoot.controller;

import com.miportfolioweb.SpringBoot.controller.model.Usuario;
import com.miportfolioweb.SpringBoot.controller.model.dto.UserDto;
import com.miportfolioweb.SpringBoot.controller.service.Authservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    @Autowired
    Authservice service;
    @PostMapping("/login")
    public boolean Login(@RequestBody UserDto userDto){
        return service.isUserEnabled(userDto) ;
    }
    @PostMapping("/register")
    public void register(@RequestBody Usuario u) throws Exception{
        
        service.crearUsuario(u);
    }
}
