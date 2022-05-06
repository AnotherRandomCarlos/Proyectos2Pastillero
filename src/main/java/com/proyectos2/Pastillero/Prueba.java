package com.proyectos2.Pastillero;


import javax.persistence.*;
import javax.print.DocFlavor;

@Entity
@Table(name="Prueba")
public class Prueba {

    @Id
    @Column(name = "id")
    private String id;
    @Column(name = "nombre")
    private String nombre;

    public Prueba() {
    }

    public Prueba(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
