package com.example.demo.Dto.Response;

import java.time.LocalDateTime;

public class MuestraResponse {
    private Long id;
    private LocalDateTime fechahoramuestra;
    private String matricula;
    private double longitudMuestra;
    private double latitudMuestra;
    private double nivelMar;

    public MuestraResponse(){

    }

    public MuestraResponse(Long id,
                           LocalDateTime fechahoramuestra, String matricula, double longitudMuestra,
                           double latitudMuestra, double nivelMar) {
        this.id = id;
        this.fechahoramuestra = fechahoramuestra;
        this.matricula = matricula;
        this.longitudMuestra = longitudMuestra;
        this.latitudMuestra = latitudMuestra;
        this.nivelMar = nivelMar;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getFechahoramuestra() {
        return fechahoramuestra;
    }

    public void setFechahoramuestra(LocalDateTime fechahoramuestra) {
        this.fechahoramuestra = fechahoramuestra;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getLongitudMuestra() {
        return longitudMuestra;
    }

    public void setLongitudMuestra(double longitudMuestra) {
        this.longitudMuestra = longitudMuestra;
    }

    public double getLatitudMuestra() {
        return latitudMuestra;
    }

    public void setLatitudMuestra(double latitudMuestra) {
        this.latitudMuestra = latitudMuestra;
    }

    public double getNivelMar() {
        return nivelMar;
    }

    public void setNivelMar(double nivelMar) {
        this.nivelMar = nivelMar;
    }
}
