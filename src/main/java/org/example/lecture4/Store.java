package org.example.lecture4;

public class Store {
    private static Store instance;
    private Store() {
    }

    public static Store getInstance() {
        if (instance == null) {
            return instance = new Store();
        }
        return instance;
    }
}
