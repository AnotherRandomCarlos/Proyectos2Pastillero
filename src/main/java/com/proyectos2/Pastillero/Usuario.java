package com.proyectos2.Pastillero;

import javax.persistence.*;

@Entity
@Table(name="tabla_usuario")
public class Usuario {
    @Id
    @SequenceGenerator(name="tabla_usuario_id_usuario_seq",
            sequenceName="tabla_usuario_id_usuario_seq",
            allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator="tabla_usuario_id_usuario_seq")
    @Column(updatable = false)
    private int id_usuario;
    @Column
    private String nombre;
    @Column
    private String apellidos;
    @Column
    private String nombre_usuario;
    @Column
    private String contrasenia;

    public Usuario() {
    }

    public Usuario(String nombre, String apellidos, String nombre_usuario, String contrasenia) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nombre_usuario = nombre_usuario;
        this.contrasenia = contrasenia;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id_usuario=" + id_usuario +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", nombre_usuario='" + nombre_usuario + '\'' +
                ", contrasenia='" + contrasenia + '\'' +
                '}';
    }
}
