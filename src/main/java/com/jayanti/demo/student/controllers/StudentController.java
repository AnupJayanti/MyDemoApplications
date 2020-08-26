package com.jayanti.demo.student.controllers;

import com.jayanti.demo.student.domain.Student;
import com.jayanti.demo.student.exceptions.StudentNotFoundException;
import com.jayanti.demo.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    @GetMapping("/student/{studentId}")
    public Student getStudent(@PathVariable int studentId){
        Optional<Student> student = studentRepository.findById(studentId);
        if(!student.isPresent())
            throw new StudentNotFoundException("studentId:"+studentId);
        else
            return student.get();
    }

    @GetMapping("/students")
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

   @PostMapping("/student")
    public Student addNewStudent(@RequestBody Student student){
        return studentRepository.save(student);
    }

    @DeleteMapping("/student/{studentId}")
    public void deleteStudent(@PathVariable int studentId){
        studentRepository.deleteById(studentId);
    }
}
