package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


    @GetMapping(value = "/")
    public String helloWorld(){

        int b = 5;

        return "Hello world" + b;
    }

}
