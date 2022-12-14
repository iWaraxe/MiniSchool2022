package org.example.lecture19.lombok;

import com.google.common.base.Preconditions;

import java.util.HashMap;
import java.util.Map;

public class Age {
    private static final Map<Integer, Age> poolOfAges = new HashMap<>();
    private final int value;

    public Age(int value) {
        Preconditions.checkArgument(value >= 0, "Age must be positive: " + value);
        Preconditions.checkArgument(value <= 125, "Age must be less than 126: " + value);
        this.value = value;
    }

    public static Age of(int value) {
        Age fromPool = poolOfAges.get(value);
        if (fromPool != null) {
            return fromPool;
        }
        Age newAge = new Age(value);
        poolOfAges.put(value, newAge);
        return newAge;
    }

}
