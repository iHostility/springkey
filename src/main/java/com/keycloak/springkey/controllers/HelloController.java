package com.keycloak.springkey.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String index(){
        return "welcome";
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

}