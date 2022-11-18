package com.upc.college.entity;

import javax.persistence.*;

@Entity
@Table(name = "grado")
public class Grado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idgrado;
    private String nombre;
    private int estado;

    public Grado() {
    }

    public Grado(int idgrado, String nombre, int estado) {
        this.idgrado = idgrado;
        this.nombre = nombre;
        this.estado = estado;
    }

    public int getIdgrado() {
        return idgrado;
    }

    public void setIdgrado(int idgrado) {
        this.idgrado = idgrado;
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
