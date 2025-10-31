package com.ems.auth_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    @GetMapping(path = "/")
    public String fetchUser() {
        return "API Up & Running...";
    }
}
