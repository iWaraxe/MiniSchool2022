package org.example.lecture18.t3behavioral.p4chainofresponsibilities.handlers;

public interface Handler {
    void handleRequest(String input);
    void setNext(Handler handler);
}
