package com.example.demo.Controlador;

import com.example.demo.Dto.Response.MuestraResponse;
import com.example.demo.Entidades.Muestra;
import com.example.demo.Servicio.MuestraServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@Controller
public class MuestraControlador {


    @Autowired
    private MuestraServicio muestraservicio;

    @PostMapping("/registroMuestra")
    public ResponseEntity<MuestraResponse> registroMuestra(@RequestBody Long id, LocalDateTime fechahoramuestra, String matricula,
                                                           double longitudMuestra, double latitudMuestra, double nivelMar){
        Muestra muestra= new Muestra();
        MuestraResponse muestraResponse = new MuestraResponse();
        muestraResponse.setId(muestra.getId());
        muestraResponse.setFechahoramuestra(muestra.getFechahoramuestra());
        muestraResponse.setMatricula(muestra.getMatricula());
        muestraResponse.setLongitudMuestra(muestra.getLongitudMuestra());
        muestraResponse.setLatitudMuestra(muestra.getLatitudMuestra());
        muestraResponse.setNivelMar(muestra.getNivelMar());

        return ResponseEntity.ok(muestraResponse);
    }

    @GetMapping("/muestras/boyas/{boya_id}")
    public ResponseEntity<Muestra> mostrarMuestraPorId(@PathVariable("boya_id") long id){

        Muestra muestra= muestraservicio.mostrarMuestraPorID();

        if (muestra == null) {
            return ResponseEntity.notFound().build();
        } else {

        return ResponseEntity.ok(muestra);

    }
    }
    @DeleteMapping("/muestras/{id}")
    public ResponseEntity<String> resetearBoya(@PathVariable("boya_id") long id){
        Muestra muestra= muestraservicio.mostrarMuestraPorID();
            if (muestra == null) {

                return ResponseEntity.notFound().build();
            } else {

                muestra.setColorMuestra("AZUL");


                muestraservicio.actualizarMuestra();


                return ResponseEntity.noContent().build();

    }
    }
    public ResponseEntity actualizarMuestra(@PathVariable("id") long id){
                Muestra muestra= muestraservicio.actualizarMuestra();
                return ResponseEntity.ok(id);
            }
        }

