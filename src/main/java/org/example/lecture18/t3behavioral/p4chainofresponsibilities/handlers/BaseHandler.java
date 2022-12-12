package org.example.lecture18.t3behavioral.p4chainofresponsibilities.handlers;

public abstract class BaseHandler implements Handler {
    private Handler next;

    public Handler getNext() {
        return next;
    }

    @Override
    public void setNext(Handler next) {
        this.next = next;
    }

    public abstract void handleRequest(String input);

}
