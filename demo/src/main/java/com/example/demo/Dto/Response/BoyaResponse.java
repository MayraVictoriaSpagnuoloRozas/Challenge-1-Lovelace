package com.example.demo.Dto.Response;

import com.example.demo.Entidades.Muestra;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;

import java.util.List;

public class BoyaResponse {

    public Long Boyaid;
    public String colorLuz;
    public Long longitudBoya;
    public Long latitudBoya;
    public List<Muestra> muestras;

    public Long getBoyaid() {
        return Boyaid;
    }

    public void setBoyaid(Long boyaid) {
        Boyaid = boyaid;
    }

    public String getColorLuz() {
        return colorLuz;
    }

    public void setColorLuz(String colorLuz) {
        this.colorLuz = colorLuz;
    }

    public Long getLongitudBoya() {
        return longitudBoya;
    }

    public void setLongitudBoya(Long longitudBoya) {
        this.longitudBoya = longitudBoya;
    }

    public Long getLatitudBoya() {
        return latitudBoya;
    }

    public void setLatitudBoya(Long latitudBoya) {
        this.latitudBoya = latitudBoya;
    }

    public List<Muestra> getMuestras() {
        return muestras;
    }

    public void setMuestras(List<Muestra> muestras) {
        this.muestras = muestras;
    }
}
