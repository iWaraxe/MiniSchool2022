package org.example.lecture17.t1creational.p2factory.ex1;

public class Wagon implements Transport {
    @Override
    public void deliver() {
        System.out.println("WAGON: I deliver object.");
    }
}
