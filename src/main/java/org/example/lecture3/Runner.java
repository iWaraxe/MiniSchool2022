package org.example.lecture3;


import org.checkerframework.checker.units.qual.A;

import java.math.BigDecimal;
import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        // primitive type
        int i = 1;
        // reference type
        User user = new User("1", "Tyrion", "Lannister");

        user.setAge(Age.of(30));



        Age age1 = new Age(11);
        Age age2 = new Age(11);

        System.out.println(age1);
        System.out.println(age2);
        System.out.println(age1 == age2);
    }
}
