package com.tecsup.demo.domain.persistence;

import com.tecsup.demo.domain.entities.Alumnos;
import org.springframework.data.repository.CrudRepository;

public interface AlumnoDao extends CrudRepository<Alumnos, Integer> {
}
