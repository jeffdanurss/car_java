package com.vehiculos;

 public class Vehiculo {
    protected String marca;
    public Vehiculo(String marca) {
        this.marca = marca;
    }

    public void acelerar() {
        System.out.println("El vehículo " + marca + " está acelerando.");
    }
    
    @Override
    public String toString() {
        return getClass().getSimpleName() +"Vehículo de marca: " + marca;   
    }
 }