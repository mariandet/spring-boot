package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.managementSystem.entities.sql.ShopInfoEntity;
import com.example.demo.managementSystem.services.ManageService;

@RestController
public class demoController {


    @GetMapping("/text")
    public String getText(){
        return "Hello World";
    }

    
}
