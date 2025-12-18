package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.entity.*;
import com.example.demo.service.*;
import com.example.demo.repository.*;
import java.util.*;


@Service
public class studentServiceImpl implements studentService{
    
    @Autowired
    studentRepo repo;

    List<studentEntity> getAll(){
        return repo.findAll();
    }

    public  studentEntity addStudent(studentEntity student){
        return repo.save(student);
    }
}


