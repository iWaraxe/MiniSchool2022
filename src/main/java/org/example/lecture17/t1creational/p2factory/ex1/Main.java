package org.example.lecture17.t1creational.p2factory.ex1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TransportFactory transportFactory = new TransportFactory();
        Transport wagon = transportFactory.getTransport("wagon");
        Transport ship = transportFactory.getTransport("ship");
        List<Transport> transports = new ArrayList<>();
        transports.add(wagon);
        transports.add(ship);

        for(Transport transport : transports) {
            transport.deliver();
        }
    }
}
