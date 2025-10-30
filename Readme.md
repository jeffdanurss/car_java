# Car Java - Inheritance and Polymorphism Example

This project is a practical demonstration of core Object-Oriented Programming (OOP) principles in Java, including **inheritance**, **polymorphism**, and **encapsulation**.

It models a simple vehicle system where different types of vehicles share a common base but exhibit unique behaviors.

##  Overview

The program features a hierarchy of vehicle types that inherit from a common `Vehiculo` class. Each subclass (`Carro`, `Moto`, `Camion`) overrides the `acelerar()` (accelerate) method to provide its own specific behavior, showcasing polymorphism in action.

##  Technologies Used

- **Java 17**
- **WSL** (Windows Subsystem for Linux)
- **Visual Studio Code**

##  Classes

- `Vehiculo`: The base class that defines common properties (like `marca` - brand) and methods.
- `Carro`: A subclass representing a car, with a smooth acceleration behavior.
- `Moto`: A subclass representing a motorcycle, with a fast acceleration behavior.
- `Camion`: A subclass representing a truck, with a slow acceleration behavior due to weight.
- `Main`: The entry point that creates instances of different vehicles and demonstrates polymorphism.

## How to Run

1. **Compile** all Java files:
   ```bash
   javac src/com/vehiculos/*.java
2. **Execute** :
   ```bash
   java -cp src com.vehiculos.Main
## Purpose 
This project was created as a learning exercise to solidify understanding of OOP concepts in Java. It serves as a foundational example for future projects, such as those using Spring Boot.

-Created by Jefferson Llerena
