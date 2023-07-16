package com.example.demo.Controlador;

import com.example.demo.Servicio.BoyaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class BoyaControlador {


    @Autowired
    private BoyaControlador boyaControlador;

    @PostMapping("boya_id")
    public String crearBoya(@RequestBody Long longitudBoya(longitudBoya.set) "33.024", @RequestBody Long latitudBoya("32.001"){

        return "boya";

        }
    @GetMapping("/boya")
    public String mostarBoyas(BoyaServicio.mostrarBoyas){
        return "boya";
    }

    @GetMapping("boya_id")
    public String obtenerBoyaPorId(@PathVariable Long id){
        return "boya_id";
    }

    @PutMapping("boya_id")
    public String actualizarBoya(@RequestBody){
        return "boya_id";
    }


}
