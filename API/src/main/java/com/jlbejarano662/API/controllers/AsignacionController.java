package com.jlbejarano662.API.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.jlbejarano662.API.models.AsignacionModel;
import com.jlbejarano662.API.services.AsignacionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/asignaciones")
public class AsignacionController {
    @Autowired
    AsignacionService asignacionService;
    
    @GetMapping()
    public ArrayList<AsignacionModel> obtenerasignacion(){
        return asignacionService.obtenerAsignacion();
    }

    @PostMapping()
    public AsignacionModel guardarAsignacion(@RequestBody AsignacionModel asignacion){
        return this.asignacionService.guardarAsignacion(asignacion);
    }


    @GetMapping( path = "/{idTurista}")
    public ArrayList<AsignacionModel> obtenerPorIdTurista(@PathVariable("idTurista") Long idTurista) {
        return this.asignacionService.obtenerPorIdTurista(idTurista);
    }
    @GetMapping( path = "/{idCiudad}")
    public ArrayList<AsignacionModel> obtenerPorIdCiudad(@PathVariable("idCiudad") Long idCiudad) {
        return this.asignacionService.obtenerPorIdCiudad(idCiudad);
    }
    
    @DeleteMapping( path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.asignacionService.eliminarAsignacion(id);
        if (ok){
            return "Se eliminó la asignacion con id " + id;
        }else{
            return "No pudo eliminar la asignacion con id" + id;
        }
    }
}
