package com.upc.college.controller;

import com.upc.college.entity.Competencia;
import com.upc.college.entity.Curso;
import com.upc.college.entity.CursoDocente;
import com.upc.college.entity.CursoxCompetencia;
import com.upc.college.service.CompetenciaService;
import com.upc.college.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/competencia")
public class CompetenciaController {
    @Autowired
    CompetenciaService competenciaService;

    @CrossOrigin("http://localhost:4200")
    @GetMapping("/lista")
    public ResponseEntity<List<Competencia>> lista(){
        List<Competencia> lista = competenciaService.lista();
        return new ResponseEntity<>(lista, HttpStatus.OK);
    }

    @CrossOrigin("http://localhost:4200")
    @PostMapping("/save")
    public ResponseEntity<?> saveCompetencia(@RequestBody Competencia competencia){
        competenciaService.saveCompetencia(competencia);
        return new ResponseEntity<>("ok", HttpStatus.OK);
    }
    @CrossOrigin("http://localhost:4200")
    @PutMapping("/delete")
    public ResponseEntity<?> deleteCompetencia(@RequestBody Competencia competencia){
        competenciaService.deleteCompetencia(competencia);
        return new ResponseEntity<>("ok", HttpStatus.OK);
    }

    @CrossOrigin("http://localhost:4200")
    @PutMapping("/activar")
    public ResponseEntity<?> activarCompetencia(@RequestBody Competencia competencia){
        competenciaService.activarCompetencia(competencia);
        return new ResponseEntity<>("ok", HttpStatus.OK);
    }

    @CrossOrigin("http://localhost:4200")
    @PutMapping("/update")
    public ResponseEntity<?> updateCompetencia(@RequestBody Competencia competencia){
        competenciaService.updateCompetencia(competencia);
        return new ResponseEntity<>("ok", HttpStatus.OK);
    }

    @CrossOrigin("http://localhost:4200")
    @GetMapping("/ListCompetenciaNotCurso/{idcurso}")
    public ResponseEntity<List<Competencia>> ListCompetenciaNotCurso(@PathVariable("idcurso") int idcurso){
        List<Competencia> lista = competenciaService.ListCompetenciaNotCurso(idcurso);
        return new ResponseEntity<>(lista, HttpStatus.OK);
    }
    @CrossOrigin("http://localhost:4200")
    @GetMapping("/listCompetenciaxcurso/{idcurso}")
    public ResponseEntity<List<Competencia>> listCompetenciaxcurso(@PathVariable("idcurso") int idcurso){
        List<Competencia> lista = competenciaService.listCompetenciaxcurso(idcurso);
        return new ResponseEntity<>(lista, HttpStatus.OK);
    }
}
