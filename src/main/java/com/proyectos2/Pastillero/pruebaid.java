package com.proyectos2.Pastillero;

import javax.persistence.*;

@Entity
@Table(name="pruebaid")
public class pruebaid {

    @Id
    @SequenceGenerator(name="pruebaid_id_seq",
            sequenceName="pruebaid_id_seq",
            allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator="pruebaid_id_seq")
    @Column(updatable = false)
    private int id;
    @Column
    private String nombre;
    @Column
    private int edad;

    public pruebaid() {
    }

    public pruebaid(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getId() {
        return id;
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
