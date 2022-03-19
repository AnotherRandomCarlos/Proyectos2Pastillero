package com.proyectos2.Pastillero;

import javax.persistence.*;

@Entity
@Table(name="medicamento")
public class Medicamento {

    @Id
    private String Nombre;
    private int Dosis;

    public Medicamento() {
    }

    public Medicamento(String nombre, int dosis) {
        Nombre = nombre;
        Dosis = dosis;
    }





    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getDosis() {
        return Dosis;
    }

    public void setDosis(int dosis) {
        Dosis = dosis;
    }

    @Override
    public String toString() {
        return "Medicamento{" +
                "Nombre='" + Nombre + '\'' +
                ", Dosis=" + Dosis +
                '}';
    }
}
