package com.jlbejarano662.API.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admonsis
 */

@Entity
@Table(name="ciudades")
public class CiudadModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    
    private String Nombre;

    private int CantidadHabitantes;

    private String SitioTuristico;

    private String HotelReservado;


    public Long getId() {
        return id;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getCantidadHabitantes() {
        return CantidadHabitantes;
    }

    public String getSitioTuristico() {
        return SitioTuristico;
    }

    public String getHotelReservado() {
        return HotelReservado;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setCantidadHabitantes(int CantidadHabitantes) {
        this.CantidadHabitantes = CantidadHabitantes;
    }

    public void setSitioTuristico(String SitioTuristico) {
        this.SitioTuristico = SitioTuristico;
    }

    public void setHotelReservado(String HotelReservado) {
        this.HotelReservado = HotelReservado;
    }
}
