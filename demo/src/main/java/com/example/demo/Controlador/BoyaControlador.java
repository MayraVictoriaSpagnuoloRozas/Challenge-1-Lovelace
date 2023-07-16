package com.example.demo.Controlador;

import com.example.demo.Entidades.Boya;
import com.example.demo.Servicio.BoyaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class BoyaControlador {


    @Autowired
    private MuestraControlador muestraControlador;
    private BoyaServicio boyaServicio;


    @PostMapping("boya_id")
    public String crearBoya(@RequestBody Boya boya){
        Boya boya= new Boya();

        return "boya";

        }
    @GetMapping("/boya")
    public String mostarBoyas(Boya boya){
        List<Boya> boyas= boyaServicio.mostrarBoyas();
        return "boya";
    }

    @GetMapping("boya_id")
    public String obtenerBoyaPorId(@PathVariable Long id){
        Boya boyaDB = boyaServicio.obtenerBoyaPorId(id);
        return "boya_id";

        boyaDB.setId(boya.obtenerBoyaPorId(id));
    }


    @PutMapping("boya_id")
    public String actualizarBoya(@RequestBody Long id){
        Boya boya= boyaServicio.actualizarBoya(Long id);
        return "boya_id";
    }


}
