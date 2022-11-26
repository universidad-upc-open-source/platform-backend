package com.upc.college.service;

import com.upc.college.entity.Docente;
import com.upc.college.entity.Estudiantes;
import com.upc.college.repository.DocenteRepository;
import com.upc.college.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteService {
    @Autowired
    EstudianteRepository estudianteRepository;
    public List<Estudiantes> lista(){
        return estudianteRepository.lista();
    }

    public List<Estudiantes> listaEstiduanteGradoSeccion(int idcurso){
            return estudianteRepository.listaEstiduanteGradoSeccion(idcurso);
    }

    public List<Estudiantes> listaAlumnosxDocente(int iddocente){
        return estudianteRepository.listaAlumnosxDocente(iddocente);
    }
    public void deleteEstudiante(Estudiantes estudiantes){
        estudianteRepository.deleteEstudiante(estudiantes.getIdestudiante());
    }

    public void activateEstudiante(Estudiantes estudiantes){
        estudianteRepository.activateEstudiante(estudiantes.getIdestudiante());
    }

    public void saveEstudiante(Estudiantes estudiantes){
        estudianteRepository.saveEstudiante(estudiantes.getNombres(),estudiantes.getApellidos(),estudiantes.getDni(),estudiantes.getGrado().getIdgrado(),estudiantes.getSeccion().getIdseccion());
    }
}
