package org.example.lecture1.primitive;

public class FloatType {
    public static void main(String[] args) {
        float f = 0.1f;
        float maxValue = Float.MAX_VALUE;
        double d0 = 0.1;
        double minValue = Double.MIN_VALUE;

        // not for money
        float amount = 100.10f;
        System.out.println(1.1-0.2);
        int money = 10_000; // 10_000 cents = 100 EUR

        // #2
        double d = Double.MAX_VALUE;
        double d1 = d - 1000000000000000000L;
        System.out.println(d1 == d);
    }
}
