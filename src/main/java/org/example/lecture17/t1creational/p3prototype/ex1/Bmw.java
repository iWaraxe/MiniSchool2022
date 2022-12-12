package org.example.lecture17.t1creational.p3prototype.ex1;

public class Bmw implements Car {
    private int maxSpeed;
    private String name;
    private boolean isTurboModeOn;

    public Bmw() {
    }

    public Bmw(Bmw bmw) {
        this.name = bmw.getName();
        this.maxSpeed = bmw.getMaxSpeed();
        this.isTurboModeOn = bmw.isTurboModeOn;
    }

    @Override
    public Car clone() {
        Bmw bmw = new Bmw();
        bmw.setMaxSpeed(this.getMaxSpeed());
        bmw.setName(this.getName());
        bmw.setTurboModeOn(this.isTurboModeOn);
        return bmw;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isTurboModeOn() {
        return isTurboModeOn;
    }

    public void setTurboModeOn(boolean turboModeOn) {
        isTurboModeOn = turboModeOn;
    }

    @Override
    public String toString() {
        return "Bmw{" +
                "maxSpeed=" + maxSpeed +
                ", name='" + name + '\'' +
                ", isTurboModeOn=" + isTurboModeOn +
                '}';
    }
}
