package com.upc.college.controller;

import com.upc.college.entity.Estudiantes;
import com.upc.college.entity.Menu;
import com.upc.college.entity.Seccion;
import com.upc.college.service.MenuService;
import com.upc.college.service.SeccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/menu")
public class MenuController {
    @Autowired
    MenuService menuService;

    @CrossOrigin("http://localhost:4200")
    @GetMapping("/lista/{idtipousuario}")
    public ResponseEntity<List<Menu>> lista(@PathVariable("idtipousuario") int idtipousuario){
        List<Menu> lista = menuService.listaMenu(idtipousuario);
        return new ResponseEntity<>(lista, HttpStatus.OK);
    }

    @CrossOrigin("http://localhost:4200")
    @PostMapping("/save")
    public ResponseEntity<?> saveMenu(@RequestBody Menu menu){
        menuService.saveMenu(menu);
        return new ResponseEntity<>("ok", HttpStatus.OK);
    }
}
