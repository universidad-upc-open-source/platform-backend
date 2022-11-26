package com.upc.college.controller;

import com.upc.college.entity.Docente;
import com.upc.college.service.DocenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/docente")
public class DocenteController {
    @Autowired
    DocenteService docenteService;

    @CrossOrigin("http://localhost:4200")
    @PostMapping("/save")
    public ResponseEntity<?> saveDocente(@RequestBody Docente docente){
       System.out.println(docente);
        docenteService.saveDocente(docente);
        return new ResponseEntity<>("ok", HttpStatus.OK);
    }
    @CrossOrigin("http://localhost:4200")
    @PutMapping("/update")
    public ResponseEntity<?> updateDocente(@RequestBody Docente docente){
        docenteService.updatedocente(docente);
        return new ResponseEntity<>("ok", HttpStatus.OK);
    }
    @CrossOrigin("http://localhost:4200")
    @PutMapping("/delete")
    public ResponseEntity<?> deleteDocente(@RequestBody Docente docente){
        docenteService.deletedocente(docente);
        return new ResponseEntity<>("ok", HttpStatus.OK);
    }

    @CrossOrigin("http://localhost:4200")
    @PutMapping("/activate")
    public ResponseEntity<?> activateDocente(@RequestBody Docente docente){
        docenteService.activatedocente(docente);
        return new ResponseEntity<>("ok", HttpStatus.OK);
    }

    @CrossOrigin("http://localhost:4200")
    @GetMapping("/lista")
    public ResponseEntity<List<Docente>> lista(){
        List<Docente> lista = docenteService.lista();
        return new ResponseEntity<>(lista, HttpStatus.OK);
    }

    @CrossOrigin("http://localhost:4200")
    @GetMapping("/listaActivo")
    public ResponseEntity<List<Docente>> listaActivo(){
        List<Docente> lista = docenteService.listaActivo();
        return new ResponseEntity<>(lista, HttpStatus.OK);
    }

    @CrossOrigin("http://localhost:4200")
    @GetMapping("/login/{gmail}/{pass}")
    public ResponseEntity<List<Docente>> login(@PathVariable("gmail") String gmail,@PathVariable("pass") String pass){
        List<Docente> login = docenteService.login(gmail,pass);
        return new ResponseEntity<>(login, HttpStatus.OK);
    }
}
