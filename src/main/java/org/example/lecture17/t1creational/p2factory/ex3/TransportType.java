package org.example.lecture17.t1creational.p2factory.ex3;

import org.example.lecture17.t1creational.p2factory.ex1.Ship;
import org.example.lecture17.t1creational.p2factory.ex1.Transport;
import org.example.lecture17.t1creational.p2factory.ex1.Wagon;

import java.util.function.Supplier;

public enum TransportType {
    SHIP(Ship::new),
    WAGON(Wagon::new);

    private Supplier<Transport> transportSupplier;

    TransportType(Supplier<Transport> transportSupplier) {
        this.transportSupplier = transportSupplier;
    }

    public Supplier<Transport> getTransportSupplier() {
        return transportSupplier;
    }
}
