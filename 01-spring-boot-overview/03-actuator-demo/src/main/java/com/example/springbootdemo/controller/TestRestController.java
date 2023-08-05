package com.example.springbootdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestController {

    // expose "/" that return "Hello World"
    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
    }

    // expose a new end point for "workout"
    @GetMapping("/workout")
    public String getDailyWork() {
        return "Run a hard 15km!";
    }

    @GetMapping("/fortune")
    public String getFortune() {
        return "Today is a lucky day";
    }

}
