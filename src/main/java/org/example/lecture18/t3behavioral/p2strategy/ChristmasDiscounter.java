package org.example.lecture18.t3behavioral.p2strategy;

import java.util.Calendar;

public class ChristmasDiscounter implements Discounter {
    @Override
    public double applyDiscount(double price) {
        System.out.println("ChristmasDiscounter has been applied.");
        return price * 0.5;
    }

    @Override
    public boolean checkCondition() {
        Calendar calendar = Calendar.getInstance();
        long currentDate = calendar.getTimeInMillis();
        calendar.set(Calendar.MONTH, 11);
        calendar.set(Calendar.DAY_OF_MONTH, 24);
        long endChristmasDiscountDate = calendar.getTimeInMillis();
        calendar.set(Calendar.MONTH, 10);
        calendar.set(Calendar.DAY_OF_MONTH, 24);
        long startChristmasDiscountDate = calendar.getTimeInMillis();
        return currentDate >= startChristmasDiscountDate && currentDate <= endChristmasDiscountDate;
    }
}
