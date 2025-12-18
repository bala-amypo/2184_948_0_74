package com.example.demo.controller;

import java.util.List;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.studentEntity;
import com.example.demo.service.studentService;

@RestController
@RequestMapping("/student")
public class studentController {

    @Autowired
    private studentService service;

    @GetMapping("/getAllStudent")
    public List<studentEntity> getAll() {
        return service.getAll();
    }

    @PostMapping("/add")
    public studentEntity addStudent(@Valid @RequestBody studentEntity student) {
        return service.addStudent(student);
    }

    @GetMapping("/get/{id}")
    public studentEntity getbyId(@PathVariable Long id) {
        return service.getbyId(id);
    }

    @PutMapping("/update/{id}")
    public studentEntity updateBy(@PathVariable Long id,
                                  @Valid @RequestBody studentEntity newstu) {
        return service.updateBy(id, newstu);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteByID(@PathVariable Long id) {
        service.deleteByID(id);
        return "Deleted Successfully!";
    }
}
