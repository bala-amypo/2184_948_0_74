package com.example.demo.exception;

public class StudenetNotFoundException extends RuntimeException{
    public StudentNotFoundException(String errMsg){
        super(errMsg);
    }
}