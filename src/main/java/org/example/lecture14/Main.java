package org.example.lecture14;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    //  chapter 10

    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, -3, 4, 54, -1, 2, 3);
        List<Integer> positive = findByCondition(integers, integer -> integer > 0);
        List<Integer> negative = findByCondition(integers, integer -> integer < 0);
        doByCondition(integers, System.out::print, i -> i > 0);
        printPositive(integers);
        System.out.println(positive);
        System.out.println(negative);

        A a = i -> {};
        a.doSomeDefaultWork();
        A.doSomeStaticWork(1);
    }

    public static List<Integer> findByCondition(List<Integer> integers, Predicate<Integer> integerCondition) {
        List<Integer> integersByCondition = new ArrayList<>();
        for (Integer integer : integers) {
            if (integerCondition.test(integer)) {
                integersByCondition.add(integer);
            }
        }
        return integersByCondition;
    }

    public static void printPositive(List<Integer> integers) {
        doByCondition(integers, System.out::println, i -> i > 0);
    }

    public static void doByCondition(List<Integer> integers, Consumer<Integer> command, Predicate<Integer> integerCondition) {
        for (Integer integer : integers) {
            if (integerCondition.test(integer)) {
                command.accept(integer);
            }
        }
    }
}
