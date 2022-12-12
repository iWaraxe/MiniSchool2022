package org.example.lecture15;

import java.util.List;

public class Example2 {
    public static void main(String[] args) {
        List<User> listOfUsers = List.of(new User("aaa"), new User("bb"));

        Integer result = listOfUsers.stream()
                .map(User::getUsername)
                .map(String::trim)
                .map(String::length)
                .reduce(0, Integer::sum);

        System.out.println(result);
    }
}
