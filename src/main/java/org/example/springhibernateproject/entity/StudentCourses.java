package org.example.springhibernateproject.entity;

import jakarta.persistence.*;

@Entity
@Table(name="grade")
public class StudentCourses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private double score;
    @ManyToOne(cascade= CascadeType.ALL)
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne(cascade= CascadeType.ALL)
    @JoinColumn(name = "course_id")
    private Course course;




    public StudentCourses(){
        super();
    }

    public StudentCourses(double score, Student student, Course course) {
        this.score = score;
        this.student = student;
        this.course = course;
    }

}
