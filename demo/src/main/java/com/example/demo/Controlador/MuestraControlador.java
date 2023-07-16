package com.example.demo.Controlador;

import com.example.demo.Servicio.MuestraServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MuestraControlador {

    @Autowired
    private MuestraControlador muestraControlador;

    @PostMapping
    public String registrarMuestra(){
        return"";
    }

    @GetMapping("boya_id")
    public String listaDeMuestras(){
        return "boya_id";

    }

    @DeleteMapping
    public String resetearBoya(){
        return"";

    }
}
