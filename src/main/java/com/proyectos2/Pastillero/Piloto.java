package com.proyectos2.Pastillero;

import javax.persistence.*;

@Entity
@Table(name = "piloto")
public class Piloto {

    @Id
    private String Nombre;
    private String Apellidos;

    public Piloto() {
    }

    public Piloto(String nombre, String apellidos) {
        Nombre = nombre;
        Apellidos = apellidos;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

}
