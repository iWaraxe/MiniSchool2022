package org.example.lecture15;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Example1 {
    public static void main(String[] args) {

        // SELECT * FROM USERS u WHERE u.first_name = "Catelyne"
        // map/reduce
        // User
        // map: User.getFirstName().length -> number
        // reduce: start from 0, (a,b) -> a+b

        // start stream
        // op1
        // op2
        // op3
        // ...
        // opn
        // terminal operation


        List<Integer> integers = List.of(1, 2, -3, 4, 54, -1, 2, 3);

        List<Integer> result = integers.stream()
                .filter(i -> i > 0)
                .filter(i -> i % 2 == 0)
                .map(i -> i / 2)
                .collect(Collectors.toList());

        System.out.println(result);
    }

    public static void doByCondition(List<Integer> integers,
                                     Consumer<Integer> command,
                                     Predicate<Integer> integerCondition) {
        for (Integer integer : integers) {
            if (integerCondition.test(integer)) {
                command.accept(integer);
            }
        }
    }

    public static List<Integer> findByCondition(List<Integer> integers,
                                                Predicate<Integer> integerCondition) {
        List<Integer> integersByCondition = new ArrayList<>();
        for (Integer integer : integers) {
            if (integerCondition.test(integer)) {
                integersByCondition.add(integer);
            }
        }
        return integersByCondition;
    }


}
