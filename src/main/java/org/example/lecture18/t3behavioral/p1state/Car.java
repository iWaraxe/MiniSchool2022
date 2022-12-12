package org.example.lecture18.t3behavioral.p1state;

public class Car {
    private State state;

    public Car() {
        this.state = new LockedState(this);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
