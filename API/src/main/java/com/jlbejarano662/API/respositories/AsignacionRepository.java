package com.jlbejarano662.API.respositories;

import java.util.ArrayList;

import com.jlbejarano662.API.models.AsignacionModel;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AsignacionRepository extends CrudRepository<AsignacionModel, Long>{

    public abstract ArrayList<AsignacionModel> findByIdTurista(Long idTurista);

    public abstract ArrayList<AsignacionModel> findByIdCiudad(Long idCiudad);

    @Query(value="{call asignaciones(:idCiudad, :date, :identificador)}", nativeQuery = true)
    int contarAsignaciones(@Param("idCiudad")Long idCiudad, @Param("date")String Fecha, @Param("identificador")Long id);
}
