package org.example.springhibernateproject.service.Impl;

import jakarta.transaction.Transactional;
import org.example.springhibernateproject.dao.Impl.StudentDAOImpl;
import org.example.springhibernateproject.dao.StudentDAO;
import org.example.springhibernateproject.entity.Student;
import org.example.springhibernateproject.service.StudentService;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {


    /*
     *
     *
     *     @Autowired
    public SessionFactory sessionFactory;
     *     deja appelé en DAOOOOOOOOOOOOOO  et c est ca qui a causé le conflict
     */
// ce n est pas logique

@Autowired
    private StudentDAO studentDao;
    private String message;
    private String alert;
    private String warning;


    @Override
    public void saveStudent() {
    }

    @Override
    public void updateStudent() {
    }
    @Override
    public void deleteStudent() {
    }
    @Override
    public void getStudent() {
    }

    @Transactional
    @Override
    public List<Student> getAllStudentsService() {
        return studentDao.getAll();
    }

    public String getMessage() {
        return message;
    }

    public String getAlert() {
        return alert;
    }

    public String getWarning() {
        return warning;
    }

    private void setMessage(String message) {
        this.message = message;
    }

    private void setAlert(String alert) {
        this.alert = alert;
    }

    private void setWarning(String warning) {
        this.warning = warning;
    }
}
