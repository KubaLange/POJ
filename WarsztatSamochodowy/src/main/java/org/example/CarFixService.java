package org.example;

public class CarFixService {
    public Car fixCar(FailureType failureType, Car car) {
        switch (failureType) {
            case ENGINE_FAILURE:
                System.out.println("ENGINE_FAILURE;");
                System.out.println("Fixing engine for car: " + car.getModel());
                car.setEngine(new Engine(2.0, "NewEngineModel")); // Ustawienie nowego silnika
                break;
            case WHEELS_FAILURE:
                System.out.println("WHEELS_FAILURE;");
                System.out.println("Fixing wheels for car: " + car.getModel());
                car.setWheels(new Wheels(300)); // Ustawienie nowych kół
                break;
            case BODY_FAILURE:
                System.out.println("BODY_FAILURE;");
                System.out.println("Fixing body for car: " + car.getModel());
                car.setBody(new Body(Color.RED)); // Ustawienie nowej karoserii
                break;
        }
        System.out.println();
        return car;
    }
}
