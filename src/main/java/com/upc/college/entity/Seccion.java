package com.upc.college.entity;

import javax.persistence.*;

@Entity
@Table(name = "seccion")
public class Seccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idseccion;
    private String nombre;
    private int estado;

    public Seccion() {
    }

    public Seccion(int idseccion, String nombre, int estado) {
        this.idseccion = idseccion;
        this.nombre = nombre;
        this.estado = estado;
    }

    public int getIdseccion() {
        return idseccion;
    }

    public void setIdseccion(int idseccion) {
        this.idseccion = idseccion;
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
