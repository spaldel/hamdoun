package org.example.springhibernateproject.dao.Impl;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import org.example.springhibernateproject.dao.CourseDAO;
import org.example.springhibernateproject.entity.Course;
import org.example.springhibernateproject.entity.dto.CourseDTO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CourseDAOImpl implements CourseDAO {

    @Autowired
    public SessionFactory sessionFactory;

    @Override
    public void saveCourse(CourseDTO course) {
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.saveOrUpdate(course);
    }
    @Override
    public void updateCourse(CourseDTO course) {
        Session session = sessionFactory.getCurrentSession();
        session.update(course);
    }

    @Override
    public void deleteCourse(int id ) {
        Session session = sessionFactory.getCurrentSession();
        Course course = session.byId(Course.class).load(id);
        session.delete(course);
    }

    @Override
    public List<CourseDTO> getAll() {
        Session session = sessionFactory.getCurrentSession();
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery<CourseDTO> cq = cb.createQuery(CourseDTO.class);
        Root< CourseDTO > root = cq.from(CourseDTO.class);
        cq.select(root);
        Query query = session.createQuery(cq);
        return query.getResultList();
    }

    @Override
    public Course getCourseById(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Course.class, id);
    }
}
