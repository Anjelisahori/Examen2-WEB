package com.tecsup.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String inicio() {
        return "inicio";
    }

    @GetMapping("/Lista")
    public String lista() {
        return "listar";
    }

    @GetMapping("/docente")
    public String docente() {
        return "docente";
    }
}
