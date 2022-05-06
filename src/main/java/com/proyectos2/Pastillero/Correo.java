package com.proyectos2.Pastillero;


import javax.persistence.*;

@Entity
@Table(name="tabla_correo")
public class Correo {

    @Id
    private int id_usuario;
    @Column
    private String correo1;
    @Column
    private String correo2;
    @Column
    private String correo_supervisor;


    public Correo() {
    }

    public Correo(int id_usuario, String correo_1, String correo_2, String correo_supervisor) {
        this.id_usuario = id_usuario;
        this.correo1 = correo_1;
        this.correo2 = correo_2;
        this.correo_supervisor = correo_supervisor;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public String getCorreo1() {
        return correo1;
    }

    public void setCorreo1(String correo1) {
        this.correo1 = correo1;
    }

    public String getCorreo2() {
        return correo2;
    }

    public void setCorreo2(String correo2) {
        this.correo2 = correo2;
    }

    public String getCorreo_supervisor() {
        return correo_supervisor;
    }

    public void setCorreo_supervisor(String correo_supervisor) {
        this.correo_supervisor = correo_supervisor;
    }
}
