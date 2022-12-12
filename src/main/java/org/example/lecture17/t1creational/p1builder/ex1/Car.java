package org.example.lecture17.t1creational.p1builder.ex1;

import java.awt.*;

public class Car {
    private Color color;
    private int doorsAmount;
    private double enginePower;
    private String name;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getDoorsAmount() {
        return doorsAmount;
    }

    public double getEnginePower() {
        return enginePower;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color=" + color +
                ", doorsAmount=" + doorsAmount +
                ", enginePower=" + enginePower +
                ", name='" + name + '\'' +
                '}';
    }

    public static Builder newBuilder() {
        return new Car().new Builder();
    }

    public class Builder {
        private String name;
        private int doorsAmount;
        private double enginePower;
        private Color color;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setDoorsAmount(int doorsAmount) {
            this.doorsAmount = doorsAmount;
            return this;
        }

        public Builder setEnginePower(double enginePower) {
            this.enginePower = enginePower;
            return this;
        }

        public Builder setColor(Color color) {
            this.color = color;
            return this;
        }

        public Car build() {
            Car.this.color = this.color;
            Car.this.doorsAmount = this.doorsAmount;
            Car.this.enginePower = this.enginePower;
            Car.this.name = this.name;
            return Car.this;
        }
    }
}
