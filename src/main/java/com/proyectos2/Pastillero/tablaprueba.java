package com.proyectos2.Pastillero;

import javax.persistence.*;

@Entity
@Table (name = "tabla10")
public class tablaprueba {

    @Id
    private String nombre;
    @Column
    private int edad;

    public tablaprueba() {
    }

    public tablaprueba(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
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
}
