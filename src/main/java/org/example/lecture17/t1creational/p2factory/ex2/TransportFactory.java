package org.example.lecture17.t1creational.p2factory.ex2;

import org.example.lecture17.t1creational.p2factory.ex1.Ship;
import org.example.lecture17.t1creational.p2factory.ex1.Transport;
import org.example.lecture17.t1creational.p2factory.ex1.Wagon;

import java.util.Objects;

public class TransportFactory {
    public Transport getTransport(TransportType type) {
        if (Objects.equals(type, TransportType.WAGON)) {
            return new Wagon();
        } else if  (Objects.equals(type, TransportType.SHIP)) {
            return new Ship();
        }
        return null;
    }
}
