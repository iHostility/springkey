package com.keycloak.springkey.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/")
    public String index(Model model) {
        return "welcome";
    }

    @GetMapping("/hello")
    public String hello(Model model) {
        return "hello";
    }

}