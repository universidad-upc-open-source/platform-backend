package com.upc.college.entity;

import javax.persistence.*;

@Entity
@Table(name = "docentexcurso")
public class CursoDocente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int iddocentexcurso;

    @ManyToOne
    @JoinColumn(name = "iddocente")
    private Docente docente;

    @ManyToOne
    @JoinColumn(name = "idcurso")
    private Curso curso;

    @ManyToOne
    @JoinColumn(name = "idgrado")
    private Grado grado;

    @ManyToOne
    @JoinColumn(name = "idseccion")
    private Seccion seccion;

    public CursoDocente() {
    }

    public CursoDocente(int iddocentexcurso, Docente docente, Curso curso, Grado grado, Seccion seccion) {
        this.iddocentexcurso = iddocentexcurso;
        this.docente = docente;
        this.curso = curso;
        this.grado = grado;
        this.seccion = seccion;
    }

    public int getIddocentexcurso() {
        return iddocentexcurso;
    }

    public void setIddocentexcurso(int iddocentexcurso) {
        this.iddocentexcurso = iddocentexcurso;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
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
}
