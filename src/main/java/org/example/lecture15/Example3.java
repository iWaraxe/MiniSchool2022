package org.example.lecture15;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.function.Predicate.not;

public class Example3 {
    public static void main(String[] args) {
        List<String> list = List.of("aaa", "   ", "", " bbb ");

        List<String> blank = list.stream()
                .filter(not(String::isBlank))
                .map(String::trim)
                .collect(Collectors.toList());

        System.out.println(blank);

    }
}
