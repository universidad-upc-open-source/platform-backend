package com.upc.college.service;

import com.upc.college.entity.Estudiantes;
import com.upc.college.entity.Notas;
import com.upc.college.repository.EstudianteRepository;
import com.upc.college.repository.NotasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotasService {
    @Autowired
    NotasRepository notasRepository;
    public List<Notas> listaNotasxCurso(int idcurso){
        return notasRepository.listaNotasxCurso(idcurso);
    }
    public List<Notas> listalistarNotasxProfesor(int iddocente){
        return notasRepository.listalistarNotasxProfesor(iddocente);
    }

    public void saveNotasxCurso(Notas notas){
        notasRepository.saveNotasxCurso(notas.getEstudiantes().getIdestudiante(),notas.getCurso().getIdcurso(),notas.getNota1(),notas.getNota2(),notas.getNota3(),notas.getNota4(),notas.getPromedio());
    }
}
