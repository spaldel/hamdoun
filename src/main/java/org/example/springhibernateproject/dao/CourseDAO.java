package org.example.springhibernateproject.dao;

import org.example.springhibernateproject.entity.Course;
import org.example.springhibernateproject.entity.dto.CourseDTO;

import java.util.List;

public interface CourseDAO {

        void saveCourse(CourseDTO course);
        void updateCourse(CourseDTO course);
        void deleteCourse(int id);
        List<CourseDTO> getAll();
        Course getCourseById(int id);
}
