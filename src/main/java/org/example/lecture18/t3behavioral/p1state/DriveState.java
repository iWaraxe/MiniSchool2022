package org.example.lecture18.t3behavioral.p1state;

public class DriveState implements State {

    private Car car;

    public DriveState(Car car) {
        this.car = car;
    }

    @Override
    public void go() {
        System.out.println("I've already been moving for a while.");
    }

    @Override
    public void stop() {
        System.out.println("Okey, I will stop.");
        this.car.setState(new StartState(this.car));
    }

    @Override
    public void start() {
        System.out.println("I've been started.");
    }

    @Override
    public void lock() {
        System.out.println("I can't be locked.");
    }
}
