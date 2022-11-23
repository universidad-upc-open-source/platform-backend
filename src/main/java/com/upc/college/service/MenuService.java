package com.upc.college.service;

import com.upc.college.entity.Estudiantes;
import com.upc.college.entity.Menu;
import com.upc.college.repository.EstudianteRepository;
import com.upc.college.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService {
    @Autowired
    MenuRepository menuRepository;
    public void saveMenu(Menu menu){
        menuRepository.saveMenu(menu.getNombre(),menu.getRuta(),menu.getTipoUsuario().getIdtipousuario());
    }
    public List<Menu> listaMenu(int idtipousuario){
        return menuRepository.listarMenu(idtipousuario);
    }
}
