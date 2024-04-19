package org.example.springhibernateproject.dao.Impl;

import org.example.springhibernateproject.dao.StudentDAO;
import org.example.springhibernateproject.entity.Student;
import org.example.springhibernateproject.entity.dto.StudentDTO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO {

    @Autowired
    public SessionFactory sessionFactory;

    @Override
    public void saveStudent(StudentDTO student) {
         sessionFactory.getCurrentSession().saveOrUpdate(student);
    }
    @Override
    public void updateStudent(StudentDTO student) {
        Session session = sessionFactory.getCurrentSession();
        //        .update(student);
    }

    @Override
    public void deleteStudent(int id ) {
        Session session = sessionFactory.getCurrentSession();
        Student student = session.byId(Student.class).load(id);
        session.delete(student);
    }

    @Override
    public List<Student> getAll() {
        Session session = sessionFactory.getCurrentSession();
         List<Student> students = session.createQuery("from Student", Student.class).list();
        return students;
    }

    @Override
    public Student getStudentById(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Student.class, id);
    }
}
