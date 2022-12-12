package org.example.lecture7;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Vehicle {
    private final String vin;
    private final String model;
    private final String brand;
    private final LocalDate prodDate;

    public Vehicle(String vin, String model, String brand, LocalDate prodDate) {
        this.vin = vin;
        this.model = model;
        this.brand = brand;
        this.prodDate = prodDate;
    }

    public String getVin() {
        return vin;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public LocalDate getProdDate() {
        return prodDate;
    }

    public String getInfo() {
        String info = this.getModel() + " " +
                this.getBrand() + " " +
                this.getProdDate() + " ";
        return info;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehicle vehicle)) return false;
        return getVin().equals(vehicle.getVin());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getVin());
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vin='" + vin + '\'' +
                ", model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", prodDate=" + prodDate +
                '}';
    }

    public abstract boolean allowChildren();

}
