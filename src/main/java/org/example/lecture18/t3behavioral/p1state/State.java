package org.example.lecture18.t3behavioral.p1state;

public interface State {
    void go();
    void stop();
    void start();
    void lock();
}
