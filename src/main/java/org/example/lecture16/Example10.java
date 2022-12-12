package org.example.lecture16;

import java.util.List;
import java.util.Optional;

public class Example10 {
    public static void main(String[] args) {
        final Optional<Integer> anyNegative = List.of(1,2,3,4,-5,-6).stream()
                .filter(i -> i < 0)
                .findAny();
    }
}
