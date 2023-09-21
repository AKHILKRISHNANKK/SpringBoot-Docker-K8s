package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    @GetMapping("test/hello-world")
    public ResponseEntity<String> testApi(){
        return ResponseEntity.ok("Hello-World");
    }
}
