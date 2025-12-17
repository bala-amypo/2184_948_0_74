package com.example.demo.exception;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.MethodArgumentNotValidException;

@RestControllerAdvice
public class studentController{
    @exceptionHandler(MethodArgumentNotValidException.class)
}