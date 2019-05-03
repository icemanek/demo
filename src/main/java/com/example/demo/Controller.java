package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


    @ResponseBody
    @RequestMapping(value = "/")
    public String helloWorld(){

        return "Hello world";
    }

}
