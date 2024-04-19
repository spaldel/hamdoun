package org.example.springhibernateproject.dao;

import org.example.springhibernateproject.entity.Professor;
import org.example.springhibernateproject.entity.dto.ProfessorDTO;

import java.util.List;

public interface ProfessorDAO {
    void saveProfessor(ProfessorDTO professor);
    void updateProfessor(ProfessorDTO professor);
    void deleteProfessor(int id);
    List<ProfessorDTO> getAll();
    Professor getProfessorById(int id);
}
