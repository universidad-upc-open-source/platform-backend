package com.upc.college.controller;

import com.upc.college.entity.Estudiantes;
import com.upc.college.entity.Notas;
import com.upc.college.service.EstudianteService;
import com.upc.college.service.NotasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/nota")
public class NotasController {
    @Autowired
    NotasService notasService;

    @CrossOrigin("http://localhost:4200")
    @GetMapping("/listaNotasxCurso/{idcursosp}")
    public ResponseEntity<List<Notas>> listaNotasxCurso(@PathVariable("idcursosp") int idcurso){
        List<Notas> lista = notasService.listaNotasxCurso(idcurso);
        return new ResponseEntity<>(lista, HttpStatus.OK);
    }
    @CrossOrigin("http://localhost:4200")
    @PostMapping("/save")
    public ResponseEntity<?> saveNotasxCurso(@RequestBody Notas notas){
        notasService.saveNotasxCurso(notas);
        return new ResponseEntity<>("ok", HttpStatus.OK);
    }

    @CrossOrigin("http://localhost:4200")
    @GetMapping("/listarNotasxProfesor/{iddocentesp}")
    public ResponseEntity<List<Notas>> listalistarNotasxProfesor(@PathVariable("iddocentesp") int idcurso){
        List<Notas> lista = notasService.listalistarNotasxProfesor(idcurso);
        return new ResponseEntity<>(lista, HttpStatus.OK);
    }

}
