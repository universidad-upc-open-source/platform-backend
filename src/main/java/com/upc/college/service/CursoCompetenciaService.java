package com.upc.college.service;

import com.upc.college.entity.Competencia;
import com.upc.college.entity.CursoxCompetencia;
import com.upc.college.repository.CompetenciaRepository;
import com.upc.college.repository.CursoCompetenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoCompetenciaService {
    @Autowired
    CursoCompetenciaRepository cursoCompetenciaRepository;
    public void saveCursoCompetencia(CursoxCompetencia cursoxCompetencia){
        cursoCompetenciaRepository.saveCursoCompetencia(cursoxCompetencia.getCurso().getIdcurso(),cursoxCompetencia.getCompetencia().getIdcompetencia());
    }

}
