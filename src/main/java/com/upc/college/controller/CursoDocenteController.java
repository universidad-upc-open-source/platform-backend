package com.upc.college.controller;

import com.upc.college.entity.Curso;
import com.upc.college.entity.CursoDocente;
import com.upc.college.entity.Docente;
import com.upc.college.service.CursoDocenteService;
import com.upc.college.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cursoxdocente")
public class CursoDocenteController {
    @Autowired
    CursoDocenteService cursoDocenteService;

    @CrossOrigin("http://localhost:4200")
    @GetMapping("/lista")
    public ResponseEntity<List<CursoDocente>> lista(){
        List<CursoDocente> lista = cursoDocenteService.lista();
        return new ResponseEntity<>(lista, HttpStatus.OK);
    }

    @CrossOrigin("http://localhost:4200")
    @GetMapping("/listaDocentexCurso/{idcurso}")
    public ResponseEntity<List<CursoDocente>> listaCursoxDocente(@PathVariable("idcurso") int idcurso){
        List<CursoDocente> lista = cursoDocenteService.listaCursoxDocente(idcurso);
        return new ResponseEntity<>(lista, HttpStatus.OK);
    }
    @CrossOrigin("http://localhost:4200")
    @PostMapping("/save")
    public ResponseEntity<?> saveDocentexCurso(@RequestBody CursoDocente cursoDocente){
        cursoDocenteService.saveCursoxDocente(cursoDocente);
        return new ResponseEntity<>("ok", HttpStatus.OK);
    }

    @CrossOrigin("http://localhost:4200")
    @PutMapping("/update")
    public ResponseEntity<?> updateDocentexCurso(@RequestBody CursoDocente cursoDocente){
        cursoDocenteService.updateCursoxDocente(cursoDocente);
        return new ResponseEntity<>("ok", HttpStatus.OK);
    }
}
