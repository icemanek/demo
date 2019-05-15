package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//@RestController
//public class Controller {

    //    @Value("${param}")
//    private String startParam;
//
//    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
//    public Map<String, String> helloWorld() {
//
//        Map<String, String> hello = new HashMap<>();
//
//        hello.put("message", "Hello World");
////        hello.put("startParam", startParam);
//
//
//        return hello;
//    }
//}


//    @Value("${param2}")
//    private String parameter;
//
//
//  private List<HelloModel> helloModels;
//
//  public Controller(){
//
//      helloModels = new ArrayList<>();
//      helloModels.add(new HelloModel("wiadomosc",parameter));
//  }
//
//    @GetMapping("/all")
//    public List<HelloModel> getHello(){
//
//        return helloModels;
//    }
//}




