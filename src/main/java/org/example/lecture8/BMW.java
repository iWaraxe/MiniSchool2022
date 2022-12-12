package org.example.lecture8;

public class BMW implements Car{
    @Override
    public void go() {
        System.out.println("Go BMW, Go");
    }

    @Override
    public void stop() {
        System.out.println("Stop BMW");
    }

    @Override
    public String getName() {
        return "BMW";
    }

    @Override
    public int getMaxSpeed() {
        return 240;
    }
}
