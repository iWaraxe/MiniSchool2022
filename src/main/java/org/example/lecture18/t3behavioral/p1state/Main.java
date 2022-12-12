package org.example.lecture18.t3behavioral.p1state;

public class Main {
    public static void main(String[] args) {
        Car car2 = new Car();
        car2.getState().start();
        car2.getState().go();
        car2.getState().lock();
        car2.getState().stop();
        car2.getState().lock();
    }
}
