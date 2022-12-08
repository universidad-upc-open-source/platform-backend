package com.upc.college.service;

import com.upc.college.entity.Curso;
import com.upc.college.entity.Docente;
import com.upc.college.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {
    @Autowired
    CursoRepository cursoRepository;

    public List<Curso> lista(){
        return cursoRepository.lista();
    }
    public void saveCurso(Curso curso){
        cursoRepository.saveCurso(curso.getNombre(),curso.getFoto());
    }
    public void updateCurso(Curso curso){
        cursoRepository.updateCurso(curso.getIdcurso(),curso.getNombre(),curso.getFoto());
    }
    public void deleteCurso(Curso curso){
        cursoRepository.deleteCurso(curso.getIdcurso());
    }
    public void activarCurso(Curso curso){
        cursoRepository.activarCurso(curso.getIdcurso());
    }
}
