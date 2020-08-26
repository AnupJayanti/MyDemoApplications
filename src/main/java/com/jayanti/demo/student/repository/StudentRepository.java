package com.jayanti.demo.student.repository;

import com.jayanti.demo.student.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
  /*  @Autowired
    EntityManager em;

    public Student getStudent(int studentId){
        return em.find(Student.class,studentId);
    }

    public List<Student> getAllStudents(){
        return em.f;
    }

    public Student addStudent(Student student){
        return new Student();
    }

    public Student updateStudent(Student student){
        return new Student();
    }

    public void deleteStudent(int studentId){

    }*/
}
