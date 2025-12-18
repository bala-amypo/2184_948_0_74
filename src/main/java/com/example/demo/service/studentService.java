package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.studentEntity;

public interface studentService {

    List<studentEntity> getAll();

    studentEntity addStudent(studentEntity student);

    studentEntity getbyId(Long id);

     studentEntity updateBy(Long id,studentEntity newstu);
    
    studentEntity deleteByID(Long id);

}
