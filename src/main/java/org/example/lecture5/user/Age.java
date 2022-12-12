package org.example.lecture5.user;

import java.util.HashMap;
import java.util.Map;

import static com.google.common.base.Preconditions.checkArgument;

public class Age {
    private byte value;

    static Map<Byte, Age> agesPool = new HashMap<>();

    private Age(byte value) {
        this.value = value;
    }

    public static Age of(byte age) {

        final Age fromPool = agesPool.get(age);
        if (fromPool != null) {
            return fromPool;
        }
        final Age newAge = new Age(age);
        agesPool.put(age, newAge);
        return newAge;
    }

    private void setValue(byte value) {
        checkArgument(value >= 0, "Age must be positive");
        checkArgument(value <= 125, "Age must be less than 125");
        this.value = value;
    }
}
