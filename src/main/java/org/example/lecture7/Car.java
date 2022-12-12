package org.example.lecture7;

import java.time.LocalDate;

public final class Car extends Vehicle {
    public static final int DEFAULT_NUMBER_OF_PASSENGERS = 4;
    private final int numberOfPassengers;

    public Car(String vin, String model, String brand, LocalDate prodDate) {
        this(vin, model, brand, prodDate, DEFAULT_NUMBER_OF_PASSENGERS);
    }

    public Car(String vin, String model, String brand, LocalDate prodDate, int numberOfPassengers) {
        super(vin, model, brand, prodDate);
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public static void printCarInfo(Car car) {
        System.out.println(car.getModel() + " " +
                car.getBrand() + " " +
                car.getProdDate() + " " +
                car.getNumberOfPassengers());
    }

    @Override
    public String getInfo() {
        return super.getInfo() + this.getNumberOfPassengers();
    }

    @Override
    public String toString() {
        return getInfo();
    }

    @Override
    public boolean allowChildren() {
        return true;
    }


}
