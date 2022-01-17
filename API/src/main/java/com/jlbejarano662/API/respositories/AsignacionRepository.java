package com.jlbejarano662.API.respositories;

import java.util.ArrayList;

//import java.util.List;

import com.jlbejarano662.API.models.AsignacionModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AsignacionRepository extends CrudRepository<AsignacionModel, Long>{
    public abstract ArrayList<AsignacionModel> findBy(int id, String columna);

}
