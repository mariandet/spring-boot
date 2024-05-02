package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestParam;


@RestController 
@RequestMapping("/api")
public class StudentController {

    @GetMapping("/test")
    public String getMethodName() {
        return "Hello";
    }
    
}
