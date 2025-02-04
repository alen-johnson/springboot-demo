package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.exception.EntityNotFoundException;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    List<Student> students = new ArrayList<Student>();

    @PostConstruct
    public void loadStudents(){

        students.add(new Student("Liam", "Nelson"));
        students.add(new Student("James", "San"));
        students.add(new Student("Leon", "Kelly"));
        students.add(new Student("Sam", "Smith"));

    }

    @GetMapping
    public List<Student> getStudents(){

        return students;
    }

    @GetMapping("/{studentId}")
    public Student getStudent(@PathVariable int studentId) throws IndexOutOfBoundsException{

        if((studentId >= students.size()) || (studentId < 0)){
            throw new EntityNotFoundException("StudentId not found - "+ studentId);
        }

        return students.get(studentId);
    }
}

