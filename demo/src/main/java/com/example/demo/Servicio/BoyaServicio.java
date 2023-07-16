package com.example.demo.Servicio;

import com.example.demo.Entidades.Boya;

import java.util.List;

public interface BoyaServicio {

    public List<Boya> mostrarBoyas();

    public Boya crearBoya(Boya boya);

    public Boya obtenerBoyaPorId(Long id);

    public Boya actualizarBoya(Boya boya);

}
