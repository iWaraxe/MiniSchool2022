package org.example.lecture17.t1creational.p2factory.ex4;

import org.example.lecture17.t1creational.p2factory.ex1.Transport;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TransportFactory transportFactory = new TransportFactory();
        Transport ship = transportFactory.getTransport(TransportType.SHIP);
        Transport wagon = transportFactory.getTransport(TransportType.WAGON);

        List<Transport> transports = new ArrayList<>();
        transports.add(ship);
        transports.add(wagon);

        for(Transport transport : transports) {
            transport.deliver();
        }
    }
}
