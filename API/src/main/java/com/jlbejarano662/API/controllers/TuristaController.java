package com.jlbejarano662.API.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.jlbejarano662.API.models.TuristaModel;
import com.jlbejarano662.API.services.TuristaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/turistas")
public class TuristaController {
    
    @Autowired
    TuristaService turistaService;
    
    @GetMapping()
    public ArrayList<TuristaModel> obtenerTuristas(){
        return turistaService.obtenerTuristas();
    }

    @PostMapping()
    public TuristaModel guardarTurista(@RequestBody TuristaModel turista){
        return this.turistaService.guardarTurista(turista);
    }


    @GetMapping( path = "/{id}")
    public Optional<TuristaModel> obtenerTuristaPorId(@PathVariable("id") Long id) {
        return this.turistaService.obtenerTuristaPorId(id);
    }

    @DeleteMapping( path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.turistaService.eliminarTurista(id);
        if (ok){
            return "Se eliminó el turista con id " + id;
        }else{
            return "No pudo eliminar el turista con id " + id;
        }
    }
}
