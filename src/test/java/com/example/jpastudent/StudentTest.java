package com.example.jpastudent;

import jakarta.persistence.Id;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentTest {

    @Autowired
    StudentRepository sr;

    @Test
    void testviggo(){
        Optional<Student> std = sr.findById(1);

        if(std.isPresent()){
            Student student = std.get();
            assertEquals(1, student.getId());
        }
    }

    @Test
    void testviggoByOneLine(){
            assertEquals(1, sr.findById(1).orElse(new Student()).getId());

    }

    @Test
    void findBySname(){
        assertEquals("Viggo", sr.findByName("Viggo").orElse(new Student()).getName());

    }

}