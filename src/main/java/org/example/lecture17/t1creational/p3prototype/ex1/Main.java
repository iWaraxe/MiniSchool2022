package org.example.lecture17.t1creational.p3prototype.ex1;

public class Main {
    public static void main(String[] args) {
        Bmw bmw = new Bmw();
        bmw.setTurboModeOn(true);
        bmw.setName("BMW Xn");
        bmw.setMaxSpeed(260);
        System.out.println(bmw);

        Car bmw2 = bmw.clone();
        System.out.println(bmw2);

        Car bmw3 = new Bmw(bmw);
        System.out.println(bmw3);

        Kia kia = new Kia();
        kia.setMaxSpeed(230);
        kia.setBlindZonesControl(true);

        System.out.println();
        System.out.println(kia);
        Car kia2 = kia.clone();
        System.out.println(kia2);
    }
}
