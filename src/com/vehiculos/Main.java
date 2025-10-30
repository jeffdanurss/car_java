package com.vehiculos;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehiculo> parqueVehicular = new ArrayList<>();

        parqueVehicular.add(new Carro("Toyota"));
        parqueVehicular.add(new Moto("Honda"));
        parqueVehicular.add(new Camion("Volvo"));
        parqueVehicular.add(new Carro("Ford"));
        parqueVehicular.add(new Moto("Yamaha"));

        for (Vehiculo vehiculo : parqueVehicular) {
            System.out.println(vehiculo.toString());
            vehiculo.acelerar();
            System.out.println();
        }
    }
}