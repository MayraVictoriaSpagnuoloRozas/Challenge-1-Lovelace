package com.example.demo.Servicio;

import com.example.demo.Entidades.Muestra;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
@Service
public class MuestraServicio {

    public MuestraServicio muestraServicio;

    public MuestraServicio(){

    }

    public MuestraServicio(MuestraServicio muestraServicio) {
        this.muestraServicio = muestraServicio;
    }

    public MuestraServicio getMuestraServicio() {
        return muestraServicio;
    }

    public void setMuestraServicio(MuestraServicio muestraServicio) {
        this.muestraServicio = muestraServicio;
    }

    public Muestra registroMuestra(Long id, LocalDateTime fechahoramuestra, String matricula,
                                   double longitudMuestra, double latitudMuestra, double nivelMar) {
        return null;
    }

    public Muestra mostrarMuestraPorID() {
        return null;
    }

    public Muestra resetearMuestra() {
        return null;
    }

    public Muestra actualizarMuestra(){return null;}
}
