package com.example.aplicacionrojas;

public class Material {
    private String nombre;
    private double cantidad;
    private double costoUnitario;

    public Material(String nombre, double cantidad, double costoUnitario) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.costoUnitario = costoUnitario;
    }

    public String getNombre() {
        return nombre;
    }

    public double getCantidad() {
        return cantidad;
    }

    public double getCostoUnitario() {
        return costoUnitario;
    }
}
