package com.crud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CRUDController {

    @GetMapping("/test")
    public String test01(){
        return "Get Test";
    }
}
