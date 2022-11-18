package com.upc.college.service;

import com.upc.college.entity.Docente;
import com.upc.college.entity.TipoUsuario;
import com.upc.college.repository.DocenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocenteService {
    @Autowired
    DocenteRepository docenteRepository;

    public List<Docente> lista(){
        return docenteRepository.lista();
    }

    public List<Docente> listaActivo(){
        return docenteRepository.listaActivo();
    }
   public void saveDocente(Docente docente){
        docenteRepository.saveDocente(docente.getNombres(),docente.getApellidos(),docente.getCorreo(),docente.getContrasenia(),docente.getTipousuario().getIdtipousuario());
    }
    public void updatedocente(Docente docente){
        docenteRepository.updateDocente(docente.getIddocente(),docente.getNombres(),docente.getApellidos(),docente.getCorreo(),docente.getContrasenia(),docente.getTipousuario().getIdtipousuario());
    }
    public void deletedocente(Docente docente){
        docenteRepository.deleteDocente(docente.getIddocente());
    }
    public void activatedocente(Docente docente){
        docenteRepository.activateeDocente(docente.getIddocente());
    }
    public List<Docente> login(String gmail,String pass){
        return docenteRepository.login(gmail,pass);
    }
}
