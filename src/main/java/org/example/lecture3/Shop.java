package org.example.lecture3;

public class Shop {
    private static Shop instance;

    private Shop(){

    }

    public static Shop getInstance() {
        if (instance == null) {
            instance = new Shop();
        }
        return instance;
    }
}
