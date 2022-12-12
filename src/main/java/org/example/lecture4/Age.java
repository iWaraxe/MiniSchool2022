package org.example.lecture4;

import org.checkerframework.checker.units.qual.A;

import java.util.HashMap;
import java.util.Map;

import static com.google.common.base.Preconditions.checkArgument;

public class Age {
    private int value;
    public static Map<Integer, Age> agesPool = new HashMap<>();

    private Age(int value) {
        this.value = value;
    }

    public static Age of(int age) {
        final Age fromPool = agesPool.get(age);
        if (fromPool != null) {
            return fromPool;
        }
        final Age newAge = new Age(age);
        agesPool.put(age,newAge);
        return newAge;
    }

    public void setValue(int value) {
        checkArgument(value >= 0, "Age must be positive");
        checkArgument(value <= 125, "Age must be less than 125");
        this.value = value;
    }

    public int toInt() {
        return value;
    }

    public void increase() {
        value++;
    }
}
