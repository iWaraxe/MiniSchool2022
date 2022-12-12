package org.example.lecture17.t1creational.p2factory.ex1;

import java.util.Objects;

public class TransportFactory {
    private static final String WAGON_NAME = "wagon";
    private static final String SHIP_NAME = "ship";

    public Transport getTransport(String name) {
        if (Objects.equals(name, WAGON_NAME)) {
            return new Wagon();
        } else if  (Objects.equals(name, SHIP_NAME)) {
            return new Ship();
        }
        return null;
    }
}
