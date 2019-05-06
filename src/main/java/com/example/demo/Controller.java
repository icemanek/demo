package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Value("${param}")
    private String newParameter;

    @GetMapping(value = "/")
    public String helloWorld(){

        return "Hello world  " + newParameter ;
    }
}
