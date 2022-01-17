/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jlbejarano662.API.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Admonsis
 */

@Entity
@Table(name="turistas")
public class TuristaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;


    private String Nombres;


    private String Apellidos;


    private String FechaNacimiento;


    private int Documento;


    private String TipoDocumento;


    private int FrecuenciaViaje;


    public Long getId() {
        return id;
    }

    public String getNombres() {
        return Nombres;
    }
    public String getApellidos() {
        return Apellidos;
    }
    public int getDocumento() {
        return Documento;
    }

    public String getFechaNacimiento() {
        return FechaNacimiento;
    }

    public String getTipoDocumento() {
        return TipoDocumento;
    }

    public int getFrecuenciaViaje() {
        return FrecuenciaViaje;
    }

    public void setId(int id) {
        this.id = (long) id;
    }

    public void setNombres(String Nombres) {
        this.Nombres= Nombres;
    }
    public void setApellidos(String Apellidos) {
        this.Apellidos= Apellidos;
    }

    public void setFechaNacimiento(String FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public void setDocumento(int Documento) {
        this.Documento = Documento;
    }

    public void setTipoDocumento(String TipoDocumento) {
        this.TipoDocumento = TipoDocumento;
    }

    public void setFrecuenciaViaje(int FrecuenciaViaje) {
        this.FrecuenciaViaje = FrecuenciaViaje;
    }
    
    
}
