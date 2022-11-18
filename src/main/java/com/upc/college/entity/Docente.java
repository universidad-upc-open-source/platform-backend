package com.upc.college.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "docente")
public class Docente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int iddocente;
    private String nombres;
    private String apellidos;
    private String correo;
    private String contrasenia;

    @ManyToOne
    @JoinColumn(name = "idtipousuario")
    private TipoUsuario tipousuario;

    private int estado;

    public Docente() {
    }

    public Docente(int iddocente, String nombres, String apellidos, String correo, String contrasenia, TipoUsuario tipousuario, int estado) {
        this.iddocente = iddocente;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
        this.contrasenia = contrasenia;
        this.tipousuario = tipousuario;
        this.estado = estado;
    }

    public int getIddocente() {
        return iddocente;
    }

    public void setIddocente(int iddocente) {
        this.iddocente = iddocente;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public TipoUsuario getTipousuario() {
        return tipousuario;
    }

    public void setTipousuario(TipoUsuario tipousuario) {
        this.tipousuario = tipousuario;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}
