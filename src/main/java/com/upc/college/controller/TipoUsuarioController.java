package com.upc.college.controller;

import com.upc.college.entity.TipoUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.upc.college.service.TipoUsuarioService;

import java.util.List;

@RestController
@RequestMapping("/api/usuario")
@CrossOrigin(origins = "*", allowedHeaders = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class TipoUsuarioController {
    @Autowired
    TipoUsuarioService tipoUsuarioService;

    @GetMapping("/lista")
    public ResponseEntity<List<TipoUsuario>> lista() {
        List<TipoUsuario> lista = tipoUsuarioService.lista();
        return new ResponseEntity<>(lista, HttpStatus.OK);
    }

    //    @CrossOrigin("http://localhost:4200")
    @GetMapping("/lista/{opcion}")
    public ResponseEntity<List<TipoUsuario>> listaxId(@PathVariable("opcion") int opcion) {
        List<TipoUsuario> lista = tipoUsuarioService.listaxId(opcion);
        return new ResponseEntity<>(lista, HttpStatus.OK);
    }
}
