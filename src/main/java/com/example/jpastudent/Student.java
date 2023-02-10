package com.example.jpastudent;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Student {

    @Id //primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //generater primarykey
   private int id;
   private String name;

   public Student(String name){

   }

   public Student(){

   }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    private LocalDate bornDate;

    public LocalDate getBornDate() {
        return bornDate;
    }

    public void setBornDate(LocalDate bornDate) {
        this.bornDate = bornDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
