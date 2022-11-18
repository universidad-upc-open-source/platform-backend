package com.upc.college.entity;

import javax.persistence.*;

@Entity
@Table(name = "cursoxcompetencia")
public class CursoxCompetencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idcursoxcompetencia;

    @ManyToOne
    @JoinColumn(name = "idcurso")
    private Curso curso;


    @ManyToOne
    @JoinColumn(name = "idcompetencia")
    private Competencia competencia;

    private int estado;

    public CursoxCompetencia() {
    }

    public CursoxCompetencia(int idcursoxcompetencia, Curso curso, Competencia competencia, int estado) {
        this.idcursoxcompetencia = idcursoxcompetencia;
        this.curso = curso;
        this.competencia = competencia;
        this.estado = estado;
    }

    public int getIdcursoxcompetencia() {
        return idcursoxcompetencia;
    }

    public void setIdcursoxcompetencia(int idcursoxcompetencia) {
        this.idcursoxcompetencia = idcursoxcompetencia;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Competencia getCompetencia() {
        return competencia;
    }

    public void setCompetencia(Competencia competencia) {
        this.competencia = competencia;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}
