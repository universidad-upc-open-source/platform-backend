package com.upc.college.controller;

import com.upc.college.entity.Curso;
import com.upc.college.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/curso")
public class CursoController {
    @Autowired
    CursoService cursoService;

    @CrossOrigin("http://localhost:4200")
    @PostMapping("/save")
    public ResponseEntity<?> saveCurso(@RequestBody Curso curso){
        cursoService.saveCurso(curso);
        return new ResponseEntity<>("ok", HttpStatus.OK);
    }
    @CrossOrigin("http://localhost:4200")
    @PutMapping("/delete")
    public ResponseEntity<?> deleteCurso(@RequestBody Curso curso){
        cursoService.deleteCurso(curso);
        return new ResponseEntity<>("ok", HttpStatus.OK);
    }
    @CrossOrigin("http://localhost:4200")
    @PutMapping("/activar")
    public ResponseEntity<?> activarCurso(@RequestBody Curso curso){
        cursoService.activarCurso(curso);
        return new ResponseEntity<>("ok", HttpStatus.OK);
    }
    @CrossOrigin("http://localhost:4200")
    @GetMapping("/lista")
    public ResponseEntity<List<Curso>> lista(){
        List<Curso> lista = cursoService.lista();
        return new ResponseEntity<>(lista, HttpStatus.OK);
    }
}
