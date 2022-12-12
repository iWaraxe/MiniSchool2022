package org.example.lecture18.t3behavioral.p2strategy;

import java.util.Calendar;

public class ValentineDayDiscounter implements Discounter {
    @Override
    public double applyDiscount(double price) {
        System.out.println("ChristmasDiscounter has been applied.");
        return price * 0.75;
    }

    @Override
    public boolean checkCondition() {
        Calendar calendar = Calendar.getInstance();
        long currentDate = calendar.getTimeInMillis();
        calendar.set(Calendar.MONTH, 1);
        calendar.set(Calendar.DAY_OF_MONTH, 14);
        long endValentineDiscountDate = calendar.getTimeInMillis();
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        long startValentineDiscountDate = calendar.getTimeInMillis();
        return currentDate >= startValentineDiscountDate && currentDate <= endValentineDiscountDate;
    }
}

