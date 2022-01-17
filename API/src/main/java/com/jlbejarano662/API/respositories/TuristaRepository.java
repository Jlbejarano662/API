package com.jlbejarano662.API.respositories;

import com.jlbejarano662.API.models.TuristaModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface TuristaRepository extends CrudRepository<TuristaModel, Long> {
}
