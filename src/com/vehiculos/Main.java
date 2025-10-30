package com.vehiculos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Vehiculo> parqueVehicular = new ArrayList<>();
        Scanner leer = new Scanner(System.in);
        System.out.println("Bienvenido al sistema de gestión del parque vehicular.");

         while (true){
            System.out.println("Seleccione una opción:");
            System.out.println("1. Agregar un carro");
            System.out.println("2. Agregar una moto");
            System.out.println("3. Agregar un camión");
            System.out.println("4. Mostrar vehículos");
            System.out.println("5. Acelerar vehículos");
            System.out.println("6. Salir");
            System.out.print("Opción: ");
            int opcion = leer.nextInt();
            leer.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la marca del carro: ");
                    String marcaCarro = leer.nextLine();
                    if (!marcaCarro.isEmpty()) {
                        parqueVehicular.add(new Carro(marcaCarro));
                        System.out.println("Carro agregado exitosamente.");
                    } else {
                        System.out.println("La marca no puede estar vacía.");
                    }
                    break;
                case 2:
                    System.out.print("Ingrese la marca de la moto: ");
                    String marcaMoto = leer.nextLine();
                    if (!marcaMoto.isEmpty()) {
                        parqueVehicular.add(new Moto(marcaMoto));
                        System.out.println("Moto agregada exitosamente.");
                    } else {
                        System.out.println("La marca no puede estar vacía.");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese la marca del camión: ");
                    String marcaCamion = leer.nextLine();
                    if (!marcaCamion.isEmpty()) {
                        parqueVehicular.add(new Camion(marcaCamion));
                        System.out.println("Camión agregado exitosamente.");
                    } else {
                        System.out.println("La marca no puede estar vacía.");
                    }
                    break;
                case 4:
                    System.out.println("Vehículos en el parque vehicular:");
                    if (parqueVehicular.isEmpty()) {
                        System.out.println("No hay vehículos en el parque vehicular.");
                    } else {
                        for (Vehiculo v : parqueVehicular) {
                            System.out.println(v);
                        }
                    }
                    break;
                case 5:
                    System.out.println("Acelerando todos los vehículos:");
                    if (parqueVehicular.isEmpty()) {
                        System.out.println("No hay vehículos en el parque vehicular.");
                    } else {
                        for (Vehiculo v : parqueVehicular) {
                            v.acelerar();
                        }
                    }
                    break;    
                case 6:
                    System.out.println("Saliendo del sistema. ¡Hasta luego!");
                    leer.close();
                    return;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
         }
    }
}