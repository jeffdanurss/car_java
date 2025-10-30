package com.vehiculos;
public class Camion extends Vehiculo {

    public Camion(String marca) {
        super(marca);
    }

    @Override
    public void acelerar() {
        System.out.println("El camión " + marca + " está acelerando con fuerza y lentamente por su peso.");
    }
    
}