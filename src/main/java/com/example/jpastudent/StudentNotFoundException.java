package com.example.jpastudent;

public class StudentNotFoundException extends RuntimeException{

    public StudentNotFoundException(String name){
        super("student not found" + name);
    }
}
