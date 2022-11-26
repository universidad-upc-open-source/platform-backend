package com.upc.college.service;

import com.upc.college.entity.Curso;
import com.upc.college.entity.CursoDocente;
import com.upc.college.repository.CursoDocenteRepository;
import com.upc.college.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoDocenteService {
    @Autowired
    CursoDocenteRepository cursoDocenteRepository;

    public List<CursoDocente> lista(){
        return cursoDocenteRepository.lista();
    }
    public List<CursoDocente> listaCursoxDocente(int idcurso){
        return cursoDocenteRepository.listaCursoxDocente(idcurso);
    }

    public List<CursoDocente> listaCursoDocente(int idcurso){
        return cursoDocenteRepository.listaCursoDocente(idcurso);
    }

    public void saveCursoxDocente(CursoDocente cursoDocente){
        cursoDocenteRepository.saveDocentexCurso(cursoDocente.getDocente().getIddocente(),cursoDocente.getCurso().getIdcurso(),cursoDocente.getGrado().getIdgrado(),cursoDocente.getSeccion().getIdseccion());
    }
    public void updateCursoxDocente(CursoDocente cursoDocente){
        cursoDocenteRepository.updateCursoxDocente(cursoDocente.getIddocentexcurso(),cursoDocente.getDocente().getIddocente(),cursoDocente.getGrado().getIdgrado(),cursoDocente.getSeccion().getIdseccion());
    }
}
