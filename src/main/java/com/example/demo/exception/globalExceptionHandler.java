package com.example.demo.exception;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.MethodArgumentNotValidException;

@RestControllerAdvice
public class studentController{
    @exceptionHandler(MethodArgumentNotValidException.class)
    public ResponceEntity<?> handleFieldError(MethodArgumentNotValidException ex){
        Map<String,String> error = new HashMap<>();

        ex.getBindingData().getFieldError().forWach(err -> error.put(ex.getField(),ex.getField(),ex.getDefaultMessage()));
    
        return new ResponceEntity<>(error.HttpStatus.BAD_REQUEST);
    }
}