package com.example.demo.controller;


import org.springframework.web.bind.annotation.RestController;
@RestController

public class studentController {

    @Autowired
    studentService service;

    @GetMapping("/getAllStudent")
    public List<studentEntity> getAll()
}