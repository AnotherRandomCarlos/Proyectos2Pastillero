package com.proyectos2.Pastillero;

import javax.persistence.*;

@Entity
@Table (name = "tabla10")
public class tablaprueba {

    @Id
    private String nombre;
    @Column
    private int edad;
    @Column
    private String apellidos;

    public tablaprueba() {
    }

    public tablaprueba(String nombre, int edad, String apellidos) {
        this.nombre = nombre;
        this.edad = edad;
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
}
