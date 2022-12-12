package org.example.lecture7;

import java.time.LocalDate;

public class Truck extends Vehicle {
    private final int weight;

    public Truck(String vin, String model, String brand, LocalDate prodDate, int weight) {
        super(vin, model, brand, prodDate);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public static void printTruckInfo(Truck truck) {
        System.out.println(truck.getModel() + " " +
                truck.getBrand() + " " +
                truck.getProdDate() + " " +
                truck.getWeight());
    }

    @Override
    public String getInfo() {
        return super.getInfo() + this.getWeight();
    }

    @Override
    public boolean allowChildren() {
        return false;
    }

}
