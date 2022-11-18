package com.upc.college.entity;

import javax.persistence.*;

@Entity
@Table(name = "curso")
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idcurso;
    private String nombre;
    private String foto;
    private int estado;

    public Curso() {
    }

    public Curso(int idcurso, String nombre, String foto, int estado) {
        this.idcurso = idcurso;
        this.nombre = nombre;
        this.foto = foto;
        this.estado = estado;
    }

    public int getIdcurso() {
        return idcurso;
    }

    public void setIdcurso(int idcurso) {
        this.idcurso = idcurso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}
