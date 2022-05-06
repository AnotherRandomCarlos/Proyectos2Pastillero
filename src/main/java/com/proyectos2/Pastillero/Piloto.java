package com.proyectos2.Pastillero;

import javax.persistence.*;

@Entity
@Table(name = "piloto")
public class Piloto {

    @Id
    private String Nombre;
    private String Apellidos;
    private int Edad;
    private String Correo;

    public Piloto() {
    }

    public Piloto(String nombre, String apellidos, int edad, String correo) {
        Nombre = nombre;
        Apellidos = apellidos;
        Edad = edad;
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

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }
}
