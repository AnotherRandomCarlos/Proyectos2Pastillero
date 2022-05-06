package com.proyectos2.Pastillero;


import javax.persistence.*;

@Entity
@Table(name="Prueba")
public class Prueba {

    @Id
    private int id;
    private String nombre;

    public Prueba() {
    }

    public Prueba(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Prueba{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
