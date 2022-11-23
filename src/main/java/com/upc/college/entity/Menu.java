package com.upc.college.entity;

import javax.persistence.*;

@Entity
@Table(name = "menu")
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idmenu;
    private String nombre;
    private String ruta;

    @ManyToOne
    @JoinColumn(name = "idtipousuario")
    private TipoUsuario tipoUsuario;
    private int estado;

    public Menu() {
    }

    public Menu(int idmenu, String nombre, String ruta, TipoUsuario tipoUsuario, int estado) {
        this.idmenu = idmenu;
        this.nombre = nombre;
        this.ruta = ruta;
        this.tipoUsuario = tipoUsuario;
        this.estado = estado;
    }

    public int getIdmenu() {
        return idmenu;
    }

    public void setIdmenu(int idmenu) {
        this.idmenu = idmenu;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}
