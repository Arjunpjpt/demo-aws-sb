package com.example.demoawssb.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HomeController {

    @GetMapping("/")
    public String homePath() {
        return "Hello From AWS Server!";
    }
    @GetMapping("/ping")
    public String greeting() {
        return "Hello From Spring Boot!";
    }
}
