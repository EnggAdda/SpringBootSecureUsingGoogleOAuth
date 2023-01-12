package com.example.springbootsecureusinggoogleoauth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ControllerExample {

    @GetMapping("/get")
    public String  getMessage(){

        return "Spring Boot Security using Google OAuth2.0";
    }
}
