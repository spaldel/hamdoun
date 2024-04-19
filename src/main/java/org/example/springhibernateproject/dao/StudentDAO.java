package org.example.springhibernateproject.dao;

import org.example.springhibernateproject.entity.Student;
import org.example.springhibernateproject.entity.dto.StudentDTO;

import java.util.List;

public interface StudentDAO {
     void saveStudent(StudentDTO student);
     void updateStudent(StudentDTO student);
     void deleteStudent(int id);
     List<Student> getAll();
    Student getStudentById(int id);
}
