package org.example.lecture18.t3behavioral.p2strategy;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        double initialPrice = 100.82;
        double discountedPrice = initialPrice;
        System.out.println("Initial Price: " + initialPrice);


        Discounter christmasDiscounter = new ChristmasDiscounter();
        Discounter valentineDayDiscounter = new ValentineDayDiscounter();
        List<Discounter> discounters = new ArrayList<>();
        discounters.add(christmasDiscounter);
        discounters.add(valentineDayDiscounter);

        for (Discounter discounter : discounters) {
            if (discounter.checkCondition()) {
                discountedPrice = discounter.applyDiscount(initialPrice);
            }
        }

        System.out.println("Discounted Price: " + discountedPrice);
    }
}
