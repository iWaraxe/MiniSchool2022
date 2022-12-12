package org.example.lecture8;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        BMW bmw = new BMW();
        KIA kia = new KIA();
        Mercedes mercedes = new Mercedes();

        List<Car> carList = List.of(kia, bmw, mercedes);

        // accelerate all cars
        for (Car car : carList) {
            car.printCar();
        }
    }
}
