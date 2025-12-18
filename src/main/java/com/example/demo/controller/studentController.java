package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;

import com.example.demo.entity.studentEntity;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/student")
public class studentController {

    @Autowired
    private studentService service;

    @GetMapping("/getAll")
    public List<studentEntity> getAll() {
        return service.getAll();
    }

    @PostMapping("/add")
    public studentEntity addStudent(@Valid @RequestBody studentEntity student) {
        return service.addStudent(student);
    }
}
