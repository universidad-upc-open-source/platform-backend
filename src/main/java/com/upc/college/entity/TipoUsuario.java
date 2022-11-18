package com.upc.college.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "tipousuario")
public class TipoUsuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idtipousuario;
    private String nombre;
    private int estado;

    public TipoUsuario() {
    }

    public TipoUsuario(int idtipousuario, String nombre, int estado) {
        this.idtipousuario = idtipousuario;
        this.nombre = nombre;
        this.estado = estado;
    }

    public int getIdtipousuario() {
        return idtipousuario;
    }

    public void setIdtipousuario(int idtipousuario) {
        this.idtipousuario = idtipousuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}
