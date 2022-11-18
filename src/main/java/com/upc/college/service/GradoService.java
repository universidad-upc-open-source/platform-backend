package com.upc.college.service;

import com.upc.college.entity.Docente;
import com.upc.college.entity.Grado;
import com.upc.college.repository.DocenteRepository;
import com.upc.college.repository.GradoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GradoService {
    @Autowired
    GradoRepository gradoRepository;

    public List<Grado> lista(int estado){
        return gradoRepository.listaGrado(estado);
    }
}
