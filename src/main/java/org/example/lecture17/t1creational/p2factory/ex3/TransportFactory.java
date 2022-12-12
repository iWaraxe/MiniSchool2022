package org.example.lecture17.t1creational.p2factory.ex3;

import org.example.lecture17.t1creational.p2factory.ex1.Transport;

public class TransportFactory {
    //new factory pattern realization
    public Transport getTransport(TransportType type) {
        if (type != null) {
            return type.getTransportSupplier().get();
        }
        return null;
        //return type != null ? type.getTransportSupplier().get() : null;
    }
}
