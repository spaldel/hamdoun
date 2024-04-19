package org.example.springhibernateproject.service;

import org.example.springhibernateproject.entity.Student;

import java.util.List;

public interface StudentService {
    void saveStudent();
    void updateStudent();
    void deleteStudent();
    void getStudent();
    List<Student> getAllStudentsService();
}
