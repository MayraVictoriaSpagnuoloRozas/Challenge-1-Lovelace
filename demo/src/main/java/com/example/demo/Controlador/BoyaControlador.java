package com.example.demo.Controlador;

import com.example.demo.Dto.Request.BoyaRequest;
import com.example.demo.Entidades.Boya;
import com.example.demo.Servicio.BoyaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class BoyaControlador {


    @Autowired
    private BoyaServicio boyaServicio;


    @PostMapping("boya_id")
    public ResponseEntity<Boya> crearBoya(@RequestBody BoyaRequest boyaRequest){
        Boya boya= new Boya();

        boya.setLatitudBoya(boyaRequest.getLatitudBoya());
        boya.setLongitudBoya(boyaRequest.getLongitudBoya());

        return ResponseEntity.status(HttpStatus.CREATED).body(boya);

        }
    @GetMapping("/boya")
    public ResponseEntity mostarBoyas(Boya boya){
        List<Boya> boyas= boyaServicio.mostrarBoyas();
        return ResponseEntity.ok(boyas);
    }

    @GetMapping("boya_id")
    public ResponseEntity obtenerBoyaPorId(@PathVariable Long id){
        Boya boyaDB = boyaServicio.obtenerBoyaPorId(id);
        return ResponseEntity.ok(id);

    }


    @PutMapping("boya_id")
    public ResponseEntity actualizarBoyaColor(@RequestBody Long id, @RequestParam String colorLuz){
        Boya boya = new Boya();
        colorLuz="Rojo";
        boyaServicio.obtenerBoyaPorId(id);
        boyaServicio.actualizarBoyaColor(boya);

        return ResponseEntity.ok(id);
    }


}
