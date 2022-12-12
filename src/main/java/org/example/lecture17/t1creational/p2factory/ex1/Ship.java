package org.example.lecture17.t1creational.p2factory.ex1;

public class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("SHIP: I deliver object.");
    }
}
