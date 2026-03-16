package com.example.hsuh.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    @GetMapping
    public String say_hello(){
        return "Hello, world.";
    }
}
