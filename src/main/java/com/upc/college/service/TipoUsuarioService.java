package com.upc.college.service;

import com.upc.college.entity.TipoUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.upc.college.repository.TipoUsuarioRepository;

import java.util.List;

@Service
public class TipoUsuarioService {
    @Autowired
    TipoUsuarioRepository tipoUsuarioRepository;

    public List<TipoUsuario> lista(){
        return tipoUsuarioRepository.listaTipoUsuario();
    }

    public List<TipoUsuario> listaxId(int opcion){
        return tipoUsuarioRepository.listaTipousuarioxId(opcion);
    }
}
