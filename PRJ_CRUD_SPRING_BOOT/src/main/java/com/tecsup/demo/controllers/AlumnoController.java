package com.tecsup.demo.controllers;

import com.tecsup.demo.domain.entities.Alumnos;
import com.tecsup.demo.services.AlumnoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;

@Controller
@SessionAttributes("alumno")
public class AlumnoController {

    @Autowired
    AlumnoService alumnoService;

    @RequestMapping(value = "/listarAlumnos", method = RequestMethod.GET)
    public String listarAlumnos(Model model) {
        model.addAttribute("alumnos", alumnoService.listar());
        return "listarAlumnos";
    }

    @RequestMapping(value = "/formAlumno")
    public String crear(Map<String, Object> model) {
        Alumnos alumno = new Alumnos();
        model.put("alumno", alumno);
        return "formAlumno";
    }

    @RequestMapping(value = "/formAlumno", method = RequestMethod.POST)
    public String guardar(@Valid Alumnos alumno, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "formAlumno";
        }

        alumnoService.grabar(alumno);
        return "redirect:/listarAlumnos";
    }

    @RequestMapping(value = "/formAlumno/{id}")
    public String editar(@PathVariable(value = "id") Integer id, Map<String, Object> model) {
        Alumnos alumno = alumnoService.buscar(id);
        if (alumno == null) {
            return "redirect:/listarAlumnos";
        }
        model.put("alumno", alumno);
        return "formAlumno";
    }

    @RequestMapping(value = "/eliminarAlumno/{id}")
    public String eliminar(@PathVariable(value = "id") Integer id) {
        alumnoService.eliminar(id);
        return "redirect:/listarAlumnos";
    }

    @RequestMapping(value = "/verAlumnos", method = RequestMethod.GET)
    public String verAlumnos(Model model, @RequestParam(value = "format", required = false) String format) {
        List<Alumnos> alumnos = alumnoService.listar();
        model.addAttribute("alumnos", alumnos);

        if ("pdf".equals(format)) {
            return "alumno/ver";
        } else if ("xlsx".equals(format)) {
            return "alumno/ver.xlsx";
        }

        return "listarAlumnos";
    }
}
