package com.jlbejarano662.API.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="asignaciones")
public class AsignacionModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    private int idCiudad;
    private int idTurista;
    private double PresupuestoViaje;
    private boolean UsaTarjeta;
    private String Fecha;

    public Long getId() {
        return id;
    }

    public int getIdTurista() {
        return idTurista;
    }

    public int getIdCiudad() {
        return idCiudad;
    }

    public double getPresupuestoViaje() {
        return PresupuestoViaje;
    }

    public String getFecha() {
        return Fecha;
    }

    public boolean getUsaTarjeta() {
        return UsaTarjeta;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setIdTurista(int idTurista) {
        this.idTurista = idTurista;
    }

    public void setIdCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
    }

    public void setPresupuestoViaje(double PresupuestoViaje) {
        this.PresupuestoViaje = PresupuestoViaje;
    }

    public void setUsaTarjeta(boolean UsaTarjeta) {
        this.UsaTarjeta = UsaTarjeta;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }   
}
