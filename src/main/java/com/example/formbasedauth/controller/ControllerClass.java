package com.example.formbasedauth.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class ControllerClass {
    @GetMapping("/login")
    public String login(){
        return "Please login using Spring Security default login form.";
    }

    @GetMapping("/home")
    public String home(Principal principal) {
        return "Welcome " + principal.getName() + " 🎉";
    }
}
