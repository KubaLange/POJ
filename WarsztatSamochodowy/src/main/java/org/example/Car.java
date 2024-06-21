package org.example;

public class Car {
    private String model;
    private Engine engine;
    private Body body;
    private Wheels wheels;
    public Car(String model, Engine engine, Body body, Wheels wheels) {
        this.model = model;
        this.engine = engine;
        this.body = body;
        this.wheels = wheels;
    }

    // Metoda zwracająca model samochodu
    public String getModel() {
        return model;
    }

    // Metoda ustawiająca nowy silnik samochodu
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    // Metoda ustawiająca nową karoserię samochodu
    public void setBody(Body body) {
        this.body = body;
    }

    // Metoda ustawiająca nowe koła samochodu
    public void setWheels(Wheels wheels) {
        this.wheels = wheels;
    }

    // Metoda zwracająca tekstową reprezentację obiektu Car
    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", engine=" + engine +
                ", body=" + body +
                ", wheels=" + wheels +
                '}';
    }
}
