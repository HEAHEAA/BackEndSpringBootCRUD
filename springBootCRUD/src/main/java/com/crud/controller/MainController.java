package com.crud.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/")   //localhost:8080
    public String Main(){
        return "Here is Main";
    }





}
