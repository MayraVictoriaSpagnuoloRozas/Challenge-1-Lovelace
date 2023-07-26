package com.example.demo.Servicio;

import com.example.demo.Entidades.Boya;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BoyaServicio {

    public BoyaServicio boyaServicio;

    public BoyaServicio(){

    }

    public BoyaServicio(BoyaServicio boyaServicio) {
        this.boyaServicio = boyaServicio;
    }

    public BoyaServicio getBoyaServicio() {
        return boyaServicio;
    }

    public void setBoyaServicio(BoyaServicio boyaServicio) {
        this.boyaServicio = boyaServicio;
    }

    public List<Boya> mostrarBoyas() {
        return null;
    }

    public Boya crearBoya(Boya boya) {
        return null;
    }


    public Boya obtenerBoyaPorId(Long id) {
        return null;
    }

    public Boya actualizarBoyaColor(Boya boya) {
        return null;
    }

}
