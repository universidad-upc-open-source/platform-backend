package com.upc.college.controller;

import com.upc.college.entity.Grado;
import com.upc.college.entity.Seccion;
import com.upc.college.service.GradoService;
import com.upc.college.service.SeccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/seccion")
@CrossOrigin(origins = "*", allowedHeaders = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class SeccionController {

    @Autowired
    SeccionService seccionService;

    //    @CrossOrigin("http://localhost:4200")
    @GetMapping("/lista/{estado}")
    public ResponseEntity<List<Seccion>> lista(@PathVariable("estado") int estado) {
        List<Seccion> lista = seccionService.lista(estado);
        return new ResponseEntity<>(lista, HttpStatus.OK);
    }
}
