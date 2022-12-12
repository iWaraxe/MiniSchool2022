package org.example.lecture15;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class Example4 {

    public static final BinaryOperator<User> KEEP_ANY_AND_LOG_WARN = (a,b) -> {
        System.out.println("Warn!!!");
        return a;
    };

    public static void main(String[] args) {
        List<User> userList = List.of(
                new User("aaa"),
                new User("bbb"),
                new User("aaa"));

        Map<String, User> map1 = new HashMap<>();

        for (User user : userList) {
            map1.put(user.getUsername(), user);
        }
        System.out.println(map1);

        Map<String, List<User>> map2 = userList.stream()
                .collect(groupingBy(User::getUsername));

        Map<String, User> map3 = userList.stream()
                .collect(Collectors.toMap(User::getUsername, Function.identity(), KEEP_ANY_AND_LOG_WARN));

        System.out.println(map3);
    }
}
