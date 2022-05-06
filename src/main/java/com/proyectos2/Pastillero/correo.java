package com.proyectos2.Pastillero;


import javax.persistence.*;

@Entity
@Table(name="correos")
public class correo {

    @Id
    private int id_usuario;
    @Column
    private String correo_1;
    @Column
    private String correo_2;
    @Column
    private String correo_supervisor;


    public correo() {
    }

    public correo(int id_usuario, String correo_1, String correo_2, String correo_supervisor) {
        this.id_usuario = id_usuario;
        this.correo_1 = correo_1;
        this.correo_2 = correo_2;
        this.correo_supervisor = correo_supervisor;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getCorreo_1() {
        return correo_1;
    }

    public void setCorreo_1(String correo_1) {
        this.correo_1 = correo_1;
    }

    public String getCorreo_2() {
        return correo_2;
    }

    public void setCorreo_2(String correo_2) {
        this.correo_2 = correo_2;
    }

    public String getCorreo_supervisor() {
        return correo_supervisor;
    }

    public void setCorreo_supervisor(String correo_supervisor) {
        this.correo_supervisor = correo_supervisor;
    }
}
