package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
     @GetMapping("/getdata")
     public String getdata(){
        return "Hello World";
     }
    
}
