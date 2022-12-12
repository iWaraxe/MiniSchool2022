package org.example.lecture16;

import org.example.lecture15.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Example6 {
    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            userList.add(i, new User("un" + new Random().nextInt() + i));
        }

        List<User> listOfUsers = IntStream.range(0, 100)
                .mapToObj(i -> new User("un" + new Random().nextInt() + i))
                .collect(Collectors.toList());

        System.out.println(listOfUsers.size());

        IntStream.generate(() -> new Random().nextInt())
                .filter(i -> i > 0 && i < 100)
                .forEach(System.out::println);
    }
}
