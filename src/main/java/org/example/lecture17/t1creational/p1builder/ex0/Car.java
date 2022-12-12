package org.example.lecture17.t1creational.p1builder.ex0;

import java.awt.*;

public class Car {
    private Color color;
    private int doorAmount;
    private double enginePower;
    private String name;

    public Car() {
    }

    public Car(Color color, int doorAmount, double enginePower, String name) {
        this.color = color;
        this.doorAmount = doorAmount;
        this.enginePower = enginePower;
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getDoorAmount() {
        return doorAmount;
    }

    public void setDoorAmount(int doorAmount) {
        this.doorAmount = doorAmount;
    }

    public double getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(double enginePower) {
        this.enginePower = enginePower;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
