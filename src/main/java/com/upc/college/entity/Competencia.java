package com.upc.college.entity;

import javax.persistence.*;

@Entity
@Table(name = "competencia")
public class Competencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idcompetencia;
    private String nombre;
    private int estado;

    public Competencia() {
    }

    public Competencia(int idcompetencia, String nombre, int estado) {
        this.idcompetencia = idcompetencia;
        this.nombre = nombre;
        this.estado = estado;
    }

    public int getIdcompetencia() {
        return idcompetencia;
    }

    public void setIdcompetencia(int idcompetencia) {
        this.idcompetencia = idcompetencia;
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
