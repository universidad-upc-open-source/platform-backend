package com.upc.college.controller;

import com.upc.college.entity.Docente;
import com.upc.college.entity.Grado;
import com.upc.college.service.DocenteService;
import com.upc.college.service.GradoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/grado")
public class GradoController {
    @Autowired
    GradoService gradoService;

    @CrossOrigin("http://localhost:4200")
    @GetMapping("/lista/{estado}")
    public ResponseEntity<List<Grado>> lista(@PathVariable("estado") int estado){
        List<Grado> lista = gradoService.lista(estado);
        return new ResponseEntity<>(lista, HttpStatus.OK);
    }

}
