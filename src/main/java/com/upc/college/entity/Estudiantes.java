package com.upc.college.entity;

import javax.persistence.*;

@Entity
@Table(name = "estudiantes")
public class Estudiantes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idestudiante;
    private String nombres;
    private String apellidos;
    private String dni;

    @ManyToOne
    @JoinColumn(name = "idgrado")
    private Grado grado;

    @ManyToOne
    @JoinColumn(name = "idseccion")
    private Seccion seccion;
    private int estado;

    public Estudiantes() {
    }

    public Estudiantes(int idestudiante, String nombres, String apellidos, String dni, Grado grado, Seccion seccion, int estado) {
        this.idestudiante = idestudiante;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dni = dni;
        this.grado = grado;
        this.seccion = seccion;
        this.estado = estado;
    }

    public int getIdestudiante() {
        return idestudiante;
    }

    public void setIdestudiante(int idestudiante) {
        this.idestudiante = idestudiante;
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Grado getGrado() {
        return grado;
    }

    public void setGrado(Grado grado) {
        this.grado = grado;
    }

    public Seccion getSeccion() {
        return seccion;
    }

    public void setSeccion(Seccion seccion) {
        this.seccion = seccion;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}
