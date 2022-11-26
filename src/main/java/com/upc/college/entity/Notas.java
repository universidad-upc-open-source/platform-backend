package com.upc.college.entity;

import javax.persistence.*;

@Entity
@Table(name = "notas")
public class Notas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idnotas;
    @ManyToOne
    @JoinColumn(name = "idestudiante")
    private Estudiantes estudiantes;
    @ManyToOne
    @JoinColumn(name = "idcurso")
    private Curso curso;
    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;
    private double promedio;
    private int estado;

    public Notas() {
    }

    public Notas(int idnotas, Estudiantes estudiantes, Curso curso, double nota1, double nota2, double nota3, double nota4, double promedio, int estado) {
        this.idnotas = idnotas;
        this.estudiantes = estudiantes;
        this.curso = curso;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
        this.promedio = promedio;
        this.estado = estado;
    }

    public int getIdnotas() {
        return idnotas;
    }

    public void setIdnotas(int idnotas) {
        this.idnotas = idnotas;
    }

    public Estudiantes getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(Estudiantes estudiantes) {
        this.estudiantes = estudiantes;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getNota4() {
        return nota4;
    }

    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}
