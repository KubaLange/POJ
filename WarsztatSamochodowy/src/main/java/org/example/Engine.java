package org.example;

public class Engine {
    private double capacity;
    private String model;
    public Engine(double capacity, String model) {
        this.capacity = capacity;
        this.model = model;
    }

    // Metoda zwracająca pojemność silnika
    public double getCapacity() {
        return capacity;
    }

    // Metoda zwracająca model silnika
    public String getModel() {
        return model;
    }

    // Metoda zwracająca tekstową reprezentację obiektu Engine
    @Override
    public String toString() {
        return "Engine{" +
                "capacity=" + capacity +
                ", model='" + model + '\'' +
                '}';
    }
}

