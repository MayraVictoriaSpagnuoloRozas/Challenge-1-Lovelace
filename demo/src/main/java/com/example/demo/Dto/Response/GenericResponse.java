package com.example.demo.Dto.Response;

public class GenericResponse {
    public boolean isOkay;
    public Long id;
    public String msj;

    public GenericResponse(boolean isOkay, Long id, String msj) {
        this.isOkay = isOkay;
        this.id = id;
        this.msj = msj;
}
}