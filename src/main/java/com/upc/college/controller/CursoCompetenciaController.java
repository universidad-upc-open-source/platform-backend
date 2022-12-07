package com.upc.college.controller;

import com.upc.college.entity.Competencia;
import com.upc.college.entity.CursoxCompetencia;
import com.upc.college.entity.Docente;
import com.upc.college.service.CompetenciaService;
import com.upc.college.service.CursoCompetenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cursoCompetencia")
@CrossOrigin(origins = "*", allowedHeaders = "*", methods = {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class CursoCompetenciaController {
    @Autowired
    CursoCompetenciaService cursoCompetenciaService;

    //@CrossOrigin("http://localhost:4200")
    @PostMapping("/save")
    public ResponseEntity<?> saveCursoCompetencia(@RequestBody CursoxCompetencia cursoxCompetencia){
        cursoCompetenciaService.saveCursoCompetencia(cursoxCompetencia);
        return new ResponseEntity<>("ok", HttpStatus.OK);
    }

   // @CrossOrigin("http://localhost:4200")
    @PutMapping("/delete")
    public ResponseEntity<?> deleteCursoxCompetencia(@RequestBody CursoxCompetencia cursoxCompetencia){
        cursoCompetenciaService.deleteCursoxCompetencia(cursoxCompetencia);
        return new ResponseEntity<>("ok", HttpStatus.OK);
    }
}
