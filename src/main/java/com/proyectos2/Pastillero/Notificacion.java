package com.proyectos2.Pastillero;

import javax.persistence.*;

@Entity
@Table(name="tabla_notificacion")
public class Notificacion {

    @Id
    private int id_usuario;
    @Column
    private boolean mayusculas;
    @Column
    private boolean resumen_diario;
    @Column
    private boolean avisos_horarios;

    public Notificacion() {
    }

    public Notificacion(int id_usuario, boolean mayusculas, boolean resumen_diario, boolean avisos_horarios) {
        this.id_usuario = id_usuario;
        this.mayusculas = mayusculas;
        this.resumen_diario = resumen_diario;
        this.avisos_horarios = avisos_horarios;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public boolean isMayusculas() {
        return mayusculas;
    }

    public void setMayusculas(boolean mayusculas) {
        this.mayusculas = mayusculas;
    }

    public boolean isResumen_diario() {
        return resumen_diario;
    }

    public void setResumen_diario(boolean resumen_diario) {
        this.resumen_diario = resumen_diario;
    }

    public boolean isAvisos_horarios() {
        return avisos_horarios;
    }

    public void setAvisos_horarios(boolean avisos_horarios) {
        this.avisos_horarios = avisos_horarios;
    }
}
