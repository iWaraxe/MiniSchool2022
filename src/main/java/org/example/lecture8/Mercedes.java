package org.example.lecture8;

public class Mercedes implements Car {
    @Override
    public void go() {
        System.out.println("Go M, Go");
    }

    @Override
    public void stop() {
        System.out.println("Stop M, Stop");
    }

    @Override
    public String getName() {
        return "M";
    }

    @Override
    public int getMaxSpeed() {
        return 220;
    }
}
