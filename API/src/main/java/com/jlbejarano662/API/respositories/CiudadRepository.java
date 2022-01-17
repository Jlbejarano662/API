package com.jlbejarano662.API.respositories;

import com.jlbejarano662.API.models.CiudadModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CiudadRepository extends CrudRepository<CiudadModel, Long>{
    
}
