package com.example.demo.Entidades;

import jakarta.persistence.*;

import java.time.LocalDateTime;


@Entity
@Table (name= "Muestra")
public class Muestra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name= "id_muestra")
    private long id;

    @Column(name="fecha_hora_muestra",length = 100, nullable = false)
    private LocalDateTime fechahoramuestra;

    @Column(name="matricula_embarcacion",length = 100, nullable = false)
    private String matricula;

    @Column(name="longitud_muestra",length = 100, nullable = false)
    private double longitudMuestra;

    @Column(name="latitud_muestra",length = 100, nullable = false)
    private double latitudMuestra;

    @Column(name="nivel_mar",length = 100, nullable = false)
    private double nivelMar;

    @ManyToOne
    @JoinColumn(name = "boya_id")
    private Boya boya;

    public Muestra (){

    }

    public Muestra(long id, LocalDateTime fechahoramuestra, String matricula, double longitudMuestra,
                   double latitudMuestra, double nivelMar, Boya boya) {
        this.id = id;
        this.fechahoramuestra = fechahoramuestra;
        this.matricula = matricula;
        this.longitudMuestra = longitudMuestra;
        this.latitudMuestra = latitudMuestra;
        this.nivelMar = nivelMar;
        this.boya = boya;
    }

    public long getId() {
        return id;
    }

    public LocalDateTime getFechahoramuestra() {
        return fechahoramuestra;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getLongitudMuestra() {
        return longitudMuestra;
    }

    public double getLatitudMuestra() {
        return latitudMuestra;
    }

    public double getNivelMar() {
        return nivelMar;
    }

    public Boya getBoya() {
        return boya;
    }


}
