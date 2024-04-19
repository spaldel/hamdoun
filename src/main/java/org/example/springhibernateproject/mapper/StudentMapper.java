package org.example.springhibernateproject.mapper;


import org.example.springhibernateproject.entity.Student;
import org.example.springhibernateproject.entity.dto.StudentDTO;
import org.springframework.stereotype.Component;

@Component
public class StudentMapper {
    public StudentDTO mapToDto(Student student){
        StudentDTO studentDto = new StudentDTO();
        studentDto.setId(student.getId());
        studentDto.setName(student.getName());
        studentDto.setEmail(student.getEmail());
        studentDto.setAddress(student.getAddress());
        return studentDto;
    }
    public Student mapToStudent(StudentDTO studentDto){
        Student student = new Student();
        student.setId(studentDto.getId());
        student.setName(studentDto.getName());
        student.setEmail(studentDto.getEmail());
        student.setAddress(studentDto.getAddress());
        return student;
    }
}
