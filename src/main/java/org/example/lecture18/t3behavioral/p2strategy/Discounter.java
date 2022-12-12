package org.example.lecture18.t3behavioral.p2strategy;

public interface Discounter {
    double applyDiscount(double price);
    boolean checkCondition();
}
