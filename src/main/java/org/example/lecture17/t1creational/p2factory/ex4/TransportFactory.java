package org.example.lecture17.t1creational.p2factory.ex4;

import org.example.lecture17.t1creational.p2factory.ex1.Ship;
import org.example.lecture17.t1creational.p2factory.ex1.Transport;
import org.example.lecture17.t1creational.p2factory.ex1.Wagon;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class TransportFactory {
    private Map<TransportType, Supplier<Transport>> getTransportMap() {
        Map<TransportType, Supplier<Transport>> transportTypeMap = new HashMap<>();
        transportTypeMap.put(TransportType.SHIP, Ship::new);
        transportTypeMap.put(TransportType.WAGON, Wagon::new);
        return transportTypeMap;
    }

    public Transport getTransport(TransportType type) {
        return getTransportMap().get(type).get();
    }
}
