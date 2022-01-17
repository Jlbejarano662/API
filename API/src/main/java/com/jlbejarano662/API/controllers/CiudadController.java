package com.jlbejarano662.API.controllers;


import java.util.ArrayList;
import java.util.Optional;

import com.jlbejarano662.API.models.CiudadModel;
import com.jlbejarano662.API.services.CiudadService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ciudades")
public class CiudadController {
    
    @Autowired
    CiudadService ciudadService;
    
    @GetMapping()
    public ArrayList<CiudadModel> obtenerCiudad(){
        return ciudadService.obtenerCiudad();
    }

    @PostMapping()
    public CiudadModel guardarCiudad(@RequestBody CiudadModel ciudad){
        return this.ciudadService.guardarCiudad(ciudad);
    }


    @GetMapping( path = "/{id}")
    public Optional<CiudadModel> obtenerCiudadPorId(@PathVariable("id") Long id) {
        return this.ciudadService.obtenerCiudadPorId(id);
    }

    @DeleteMapping( path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.ciudadService.eliminarCiudad(id);
        if (ok){
            return "Se eliminó la ciudad con id " + id;
        }else{
            return "No pudo eliminar la ciudad con id" + id;
        }
    }
}
