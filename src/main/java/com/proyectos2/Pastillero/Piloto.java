package com.proyectos2.Pastillero;

import javax.persistence.*;

@Entity
@Table(name = "piloto")
public class Piloto {

    @Id
    private String Nombre;
    @Column
    private String Apellidos;
    @Column
    private String Correo;

    public Piloto() {
    }

    public Piloto(String nombre, String apellidos, String correo) {
        Nombre = nombre;
        Apellidos = apellidos;
        Correo = correo;
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


    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }
}
