package com.example.aplicacionrojas;

public class Registro {

    private String nombreEvento;
    private String descripcionEvento;

    public Registro(String nombreEvento, String descripcionEvento) {
        this.nombreEvento = nombreEvento;
        this.descripcionEvento = descripcionEvento;
    }

    public String getNombreEvento() {
        return nombreEvento;
    }

    public String getDescripcionEvento() {
        return descripcionEvento;
    }

    @Override
    public String toString() {
        return nombreEvento + ": " + descripcionEvento;
    }
}
