package org.example.lecture7;

import java.util.HashMap;
import java.util.Map;

import static com.google.common.base.Preconditions.checkArgument;

public class Age {
    private int value;
    static Map<Integer, Age> agesPool = new HashMap<>();

    private Age(int value) {
        this.value = value;
    }

    public static Age of(int age) {

        checkArgument(age >= 0, "Age must be positive");
        checkArgument(age <= 125, "Age must be less than 125");

        final Age fromPool = agesPool.get(age);
        if (fromPool != null) {
            return fromPool;
        }
        final Age newAge = new Age(age);
        agesPool.put(age, newAge);
        return newAge;
    }
}
