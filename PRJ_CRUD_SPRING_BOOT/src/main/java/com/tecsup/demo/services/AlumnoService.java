package com.tecsup.demo.services;

import com.tecsup.demo.domain.entities.Alumnos;
import java.util.List;

public interface AlumnoService {

    void grabar(Alumnos alumno);

    void eliminar(int id);

    Alumnos buscar(Integer id);

    List<Alumnos> listar();
}
