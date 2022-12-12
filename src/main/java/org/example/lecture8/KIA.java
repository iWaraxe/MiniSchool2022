package org.example.lecture8;

public class KIA implements Car{
    @Override
    public void go() {
        System.out.println("Go KIA, Go");
    }

    @Override
    public void stop() {
        System.out.println("Stop KIA, Stop");
    }

    @Override
    public String getName() {
        return "KIA";
    }

    @Override
    public int getMaxSpeed() {
        return 180;
    }
}
