package com.jlbejarano662.API.services;

import java.util.ArrayList;
import java.util.Optional;

import com.jlbejarano662.API.models.TuristaModel;
import com.jlbejarano662.API.respositories.TuristaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TuristaService {
    
    @Autowired
    TuristaRepository turistaRepository;

    public ArrayList<TuristaModel> obtenerTuristas(){
        return (ArrayList<TuristaModel>)turistaRepository.findAll();
    }
    public TuristaModel guardarTurista(TuristaModel turista){
        return turistaRepository.save(turista);
    }

    public Optional<TuristaModel> obtenerTuristaPorId(Long id){
        return turistaRepository.findById(id);
    }

    public boolean eliminarTurista(Long id) {
        try{
            turistaRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }

}
