package com.example.jpastudent;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student ,Integer> {

    Optional<Student> findByName(String name);
}
