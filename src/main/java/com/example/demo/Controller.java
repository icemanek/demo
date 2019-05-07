package com.example.demo;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class Controller {

    @Value("${param}")
    private String startParam;

    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public Map<String, String> helloWorld(){

        Map<String, String> hello = new HashMap<>();

        hello.put("message", "Hello World");
        hello.put("startParam",startParam);
        

        return hello;
    }
}
