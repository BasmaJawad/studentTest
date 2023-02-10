package com.example.jpastudent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;


@Component
public class initData implements CommandLineRunner {

    @Autowired
    StudentRepository sr;

    @Override
    public void run(String... args) throws Exception {
        Student s1 = new Student();

        s1.setId(1);
        s1.setName("Bas");
        s1.setBornDate(LocalDate.now());
        sr.save(s1);
        System.out.printf("saved");

        List<Student> lst = sr.findAll();
        System.out.println("Antal studerende i database=" + lst.size());

        s1.setId(2);
        sr.save(s1);
        System.out.println("saved");
        lst = sr.findAll();
        System.out.println("Antal studerende i database=" + lst.size());


    }
}
