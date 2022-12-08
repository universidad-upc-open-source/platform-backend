package com.upc.college.service;

import com.upc.college.entity.Competencia;
import com.upc.college.entity.Curso;
import com.upc.college.entity.CursoDocente;
import com.upc.college.entity.CursoxCompetencia;
import com.upc.college.repository.CompetenciaRepository;
import com.upc.college.repository.CursoDocenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompetenciaService {
    @Autowired
    CompetenciaRepository competenciaRepository;

    public List<Competencia> lista(){
        return competenciaRepository.lista();
    }
    public void saveCompetencia(Competencia competencia){
        competenciaRepository.saveCompetencia(competencia.getNombre());
    }

    public void deleteCompetencia(Competencia competencia){
        competenciaRepository.deleteCompetencia(competencia.getIdcompetencia());
    }
    public void activarCompetencia(Competencia competencia){
        competenciaRepository.activarCompetencia(competencia.getIdcompetencia());
    }

    public void updateCompetencia(Competencia competencia){
        competenciaRepository.updateCompetencia(competencia.getIdcompetencia(),competencia.getNombre());
    }

    public List<Competencia> ListCompetenciaNotCurso(int idcurso){
        return competenciaRepository.ListCompetenciaNotCurso(idcurso);
    }
    public List<Competencia> listCompetenciaxcurso(int idcurso){
        return competenciaRepository.listCompetenciaxcurso(idcurso);
    }
}
