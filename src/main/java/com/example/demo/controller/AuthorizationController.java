package com.example.demo.controller;

import com.example.demo.service.Authorities;
import com.example.demo.service.AuthorizationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class AuthorizationController {

    private final AuthorizationService service;

    public AuthorizationController(AuthorizationService service) {
        this.service = service;
    }

    @GetMapping("/authorize")
    public List<Authorities> getAuthorities(@RequestParam("name") String name, @RequestParam("password") String password) {
        //в @RequestParam параметры должны соответствовать пропертям
        return service.getAuthorities(name, password);
    }

}

