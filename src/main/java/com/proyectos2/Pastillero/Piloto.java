package com.proyectos2.Pastillero;

import javax.persistence.*;

@Entity
@Table(name = "piloto")
public class Piloto {

    @Id
    private String Nombre;

    public Piloto() {
    }

    public Piloto(String nombre) {
        Nombre = nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }



}
