package org.example.lecture17.t1creational.p3prototype.ex1;

public class Kia implements Car{
    private int maxSpeed;
    private boolean isBlindZonesControl;

    @Override
    public Car clone() {
        Kia kia = new Kia();
        kia.setMaxSpeed(this.getMaxSpeed());
        kia.setBlindZonesControl(this.isBlindZonesControl());
        return kia;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public boolean isBlindZonesControl() {
        return isBlindZonesControl;
    }

    public void setBlindZonesControl(boolean blindZonesControl) {
        isBlindZonesControl = blindZonesControl;
    }

    @Override
    public String toString() {
        return "Kia{" +
                "maxSpeed=" + maxSpeed +
                ", isBlindZonesControl=" + isBlindZonesControl +
                '}';
    }
}
