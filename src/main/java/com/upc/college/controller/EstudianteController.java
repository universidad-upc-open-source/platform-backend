package com.upc.college.controller;

import com.upc.college.entity.Docente;
import com.upc.college.entity.Estudiantes;
import com.upc.college.entity.Grado;
import com.upc.college.service.EstudianteService;
import com.upc.college.service.GradoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/estudiante")
@CrossOrigin(origins = "*", allowedHeaders = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class EstudianteController {
    @Autowired
    EstudianteService estudianteService;

    //    @CrossOrigin("http://localhost:4200")
    @GetMapping("/lista")
    public ResponseEntity<List<Estudiantes>> lista() {
        List<Estudiantes> lista = estudianteService.lista();
        return new ResponseEntity<>(lista, HttpStatus.OK);
    }

    //    @CrossOrigin("http://localhost:4200")
    @GetMapping("/listaEstiduanteGradoSeccion/{idcurso}")
    public ResponseEntity<List<Estudiantes>> listaEstiduanteGradoSeccion(@PathVariable("idcurso") int idcurso) {
        List<Estudiantes> lista = estudianteService.listaEstiduanteGradoSeccion(idcurso);
        return new ResponseEntity<>(lista, HttpStatus.OK);
    }

    //    @CrossOrigin("http://localhost:4200")
    @GetMapping("/listaAlumnosxDocente/{iddocentesp}")
    public ResponseEntity<List<Estudiantes>> listaAlumnosxDocente(@PathVariable("iddocentesp") int iddocente) {
        List<Estudiantes> lista = estudianteService.listaAlumnosxDocente(iddocente);
        return new ResponseEntity<>(lista, HttpStatus.OK);
    }

    //    @CrossOrigin("http://localhost:4200")
    @PutMapping("/delete")
    public ResponseEntity<?> deleteEstudiante(@RequestBody Estudiantes estudiantes) {
        estudianteService.deleteEstudiante(estudiantes);
        return new ResponseEntity<>("ok", HttpStatus.OK);
    }

    //    @CrossOrigin("http://localhost:4200")
    @PutMapping("/activate")
    public ResponseEntity<?> activateEstudiante(@RequestBody Estudiantes estudiantes) {
        estudianteService.activateEstudiante(estudiantes);
        return new ResponseEntity<>("ok", HttpStatus.OK);
    }

    //    @CrossOrigin("http://localhost:4200")
    @PostMapping("/save")
    public ResponseEntity<?> saveEstudiante(@RequestBody Estudiantes estudiantes) {
        estudianteService.saveEstudiante(estudiantes);
        return new ResponseEntity<>("ok", HttpStatus.OK);
    }
}
