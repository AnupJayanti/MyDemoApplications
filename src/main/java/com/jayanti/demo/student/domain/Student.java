package com.jayanti.demo.student.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Student {
    @GeneratedValue
    @Id
    Integer studentId;
    String studentName;


}
