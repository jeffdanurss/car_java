package com.vehiculos;
public class Carro extends Vehiculo {

    public Carro(String marca) {
        super(marca);
    }

    @Override
    public void acelerar() {
        System.out.println("El carro " + marca + " está acelerando suavemente.");
    }
    
}