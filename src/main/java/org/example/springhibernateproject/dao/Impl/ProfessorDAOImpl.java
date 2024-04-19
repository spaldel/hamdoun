package org.example.springhibernateproject.dao.Impl;


import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import org.example.springhibernateproject.dao.ProfessorDAO;
import org.example.springhibernateproject.entity.Professor;
import org.example.springhibernateproject.entity.dto.ProfessorDTO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProfessorDAOImpl implements ProfessorDAO {
    @Autowired
    public SessionFactory sessionFactory;

    @Override
    public void saveProfessor(ProfessorDTO professor) {
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.saveOrUpdate(professor);
    }
    @Override
    public void updateProfessor(ProfessorDTO professor) {
        Session session = sessionFactory.getCurrentSession();
        session.update(professor);
    }

    @Override
    public void deleteProfessor(int id ) {
        Session session = sessionFactory.getCurrentSession();
        Professor professor = session.byId(Professor.class).load(id);
        session.delete(professor);
    }

    @Override
    public List<ProfessorDTO> getAll() {
        Session session = sessionFactory.getCurrentSession();
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery<ProfessorDTO> cq = cb.createQuery(ProfessorDTO.class);
        Root< ProfessorDTO > root = cq.from(ProfessorDTO.class);
        cq.select(root);
        Query query = session.createQuery(cq);
        return query.getResultList();
    }

    @Override
    public Professor getProfessorById(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Professor.class, id);
    }
}
