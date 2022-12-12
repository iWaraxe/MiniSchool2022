package org.example.lecture17.t1creational.p1builder.ex1;

import java.awt.*;

public class Main {
    public static void main(String[] args) {

        Car.Builder builder = Car.newBuilder().setDoorsAmount(5).setName("Renault").setColor(Color.BLACK).setEnginePower(129.9);

        Car car = Car.newBuilder()
                .setDoorsAmount(5)
                .setName("Renault")
                .setColor(Color.BLACK)
                .setEnginePower(129.9)
                .build();

        System.out.println(car);
    }
}
