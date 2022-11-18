package com.upc.college.service;

import com.upc.college.entity.Grado;
import com.upc.college.entity.Seccion;
import com.upc.college.repository.GradoRepository;
import com.upc.college.repository.SeccionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeccionService {
    @Autowired
    SeccionRepository seccionRepository;

    public List<Seccion> lista(int estado){
        return seccionRepository.listaSeccion(estado);
    }
}
