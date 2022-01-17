package com.jlbejarano662.API.services;

import java.util.ArrayList;
import java.util.Optional;

import com.jlbejarano662.API.models.CiudadModel;
import com.jlbejarano662.API.respositories.CiudadRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CiudadService {
    @Autowired
    CiudadRepository ciudadRepository;

    public ArrayList<CiudadModel> obtenerCiudad(){
        return (ArrayList<CiudadModel>)ciudadRepository.findAll();
    }
    public CiudadModel guardarCiudad(CiudadModel ciudad){
        return ciudadRepository.save(ciudad);
    }

    public Optional<CiudadModel> obtenerCiudadPorId(Long id){
        return ciudadRepository.findById(id);
    }

    public boolean eliminarCiudad(Long id) {
        try{
            ciudadRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }
}
