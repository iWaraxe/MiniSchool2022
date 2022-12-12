package org.example.lecture17.t1creational.p1builder.ex0;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setColor(Color.BLUE);
        car.setDoorAmount(5);
        car.setEnginePower(200);
        car.setName("BMW");
    }
}
