package com.example.demo.Entidades;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="boya")
public class Boya {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="boya_id")
    public Long id;

    @Column(name="color_luz", length = 100, nullable = false)
    public String colorLuz;//aca seria public enum?

    @Column(name="longitud_boya", length = 100, nullable = false)
    public Long longitudBoya;

    @Column(name="latitud_boya", length = 100, nullable = false)
    public Long latitudBoya;

    @OneToMany(mappedBy = "boya")
    public List<Muestra> muestras;


    public Boya(){

    }

    public Boya(Long id, String colorLuz, Long longitudBoya, Long latitudBoya, List<Muestra> muestras) {
        this.id = id;
        this.colorLuz = colorLuz;
        this.longitudBoya = longitudBoya;
        this.latitudBoya = latitudBoya;
        this.muestras = muestras;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
