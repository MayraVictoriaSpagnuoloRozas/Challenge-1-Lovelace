package com.example.demo.Controlador;

import com.example.demo.Entidades.Muestra;
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
    private MuestraServicio muestraservicio;

    @PostMapping
    public String registroMuestra(){
        Muestra muestra= muestraservicio.registroMuestra();
        return"";
    }

    @GetMapping("boya_id")
    public String mostrarMuestraPorId(){
        Muestra muestra= muestraservicio.mostrarMuestraPorID();
        return "boya_id";

    }

    @DeleteMapping
    public String resetearBoya(){
        Muestra muestra= muestraservicio.resetearMuestra();
        return"";

    }
}
