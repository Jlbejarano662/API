package com.jlbejarano662.API.services;

import java.util.ArrayList;
import java.util.Optional;

import com.jlbejarano662.API.models.AsignacionModel;
import com.jlbejarano662.API.respositories.AsignacionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AsignacionService {
    @Autowired
    AsignacionRepository asignacionRepository;

    public ArrayList<AsignacionModel> obtenerAsignacion(){
        return (ArrayList<AsignacionModel>)asignacionRepository.findAll();
    }
    public AsignacionModel guardarAsignacion(AsignacionModel asignacion){
        return asignacionRepository.save(asignacion);
    }
    
    public ArrayList<AsignacionModel>  obtenerPorIdTurista(Long idTurista) {
        return (ArrayList<AsignacionModel>)asignacionRepository.findByIdTurista(idTurista);
    }

    public ArrayList<AsignacionModel>  obtenerPorIdCiudad(Long idCiudad) {
        return (ArrayList<AsignacionModel>)asignacionRepository.findByIdCiudad(idCiudad);
    }
    public boolean eliminarAsignacion(Long id) {
        try{
            asignacionRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }

}
