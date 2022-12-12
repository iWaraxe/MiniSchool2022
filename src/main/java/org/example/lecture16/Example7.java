package org.example.lecture16;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Example7 {
    public static void main(String[] args) {
        List.of(1,2,3,4);

        Map<Character, Long> collect = List.of("bc", "cc", "a", "b").stream()
                .flatMapToInt(String::chars)
                .mapToObj(i -> (char) i)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(collect);

        List<Integer> listOfRandom = IntStream.generate(() -> new Random().nextInt())
                .limit(10)
                .boxed()
                .collect(Collectors.toList());

        System.out.println(listOfRandom);
    }
}
