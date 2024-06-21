package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Honda", new Engine(1.6, "VTEC Turbo"), new Body(Color.BLACK), new Wheels(200)));
        cars.add(new Car("Audi", new Engine(2.0, "TFSI"), new Body(Color.WHITE), new Wheels(220)));
        cars.add(new Car("BMW", new Engine(3.0, "TwinPower Turbo"), new Body(Color.RED), new Wheels(240)));

        // Wyświetlamy samochody przed naprawą
        System.out.println("Cars before repairs:");
        cars.forEach(System.out::println);
        System.out.println();

        CarFixService carFixService = new CarFixService();

        // Naprawiamy każdy samochód używając odpowiedniej metody
        sendCarsForEach(cars, carFixService);
        sendCarsFor(cars, carFixService);
        sendCarsWithStreams(cars, carFixService);

        // Wyświetlamy samochody po naprawie
        System.out.println("\nCars after repairs:");
        cars.forEach(System.out::println);
    }

    // Metoda używająca pętli foreach
    private static void sendCarsForEach(List<Car> cars, CarFixService carFixService) {
        for (Car car : cars) {
            if ("Honda".equals(car.getModel())) {
                carFixService.fixCar(FailureType.BODY_FAILURE, car);
            }
        }
    }

    // Metoda używająca pętli for
    private static void sendCarsFor(List<Car> cars, CarFixService carFixService) {
        for (int i = 0; i < cars.size(); i++) {
            Car car = cars.get(i);
            if ("Audi".equals(car.getModel())) {
                carFixService.fixCar(FailureType.ENGINE_FAILURE, car);
            }
        }
    }

    // Metoda używająca strumieni
    private static void sendCarsWithStreams(List<Car> cars, CarFixService carFixService) {
        cars.stream()
                .filter(car -> "BMW".equals(car.getModel()))
                .forEach(car -> carFixService.fixCar(FailureType.WHEELS_FAILURE, car));
    }
}