package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.studentEntity;
import com.example.demo.repository.studentRepo;
import com.example.demo.service.studentService;
import com.example.demo.exception.StudentNotFoundException;

@Service
public class studentServiceImpl implements studentService {

    @Autowired
    private studentRepo repo;

    @Override
    public List<studentEntity> getAll() {
        return repo.findAll();
    }

    @Override
    public studentEntity addStudent(studentEntity student) {
        return repo.save(student);
    }

    @Override
    public studentEntity getbyId(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new StudentNotFoundException("Student id not found"));
    }

    @Override
    public studentEntity updateBy(Long id, studentEntity newstu) {
        studentEntity existing = getbyId(id);
        newstu.setId(existing.getId());
        return repo.save(newstu);
    }

    @Override
    public void deleteByID(Long id) {
        studentEntity existing = getbyId(id);
        repo.deleteById(id);
    }
}
