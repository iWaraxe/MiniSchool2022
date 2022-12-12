package org.example.lecture17.t1creational.p4singleton.ex1;

public class Main {
    public static void main(String[] args) {
        Shop shop1 = Shop.INSTANCE;
        Shop shop2 = Shop.INSTANCE;

        System.out.println(shop1);
        System.out.println(shop2);

        shop1 = null;
        shop2 = null;

        Shop shop3 = Shop.INSTANCE;
        System.out.println(shop3);
    }
}
