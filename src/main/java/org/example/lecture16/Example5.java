package org.example.lecture16;

import org.example.lecture15.User;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example5 {
    public static void main(String[] args) {
        List<User> userList = List.of(new User("aaa"),new User("bbb"));

        Map<String, List<User>> userByUserName = userList.stream()
                .collect(Collectors.groupingBy(User::getUsername));

        List<User> collect = userByUserName.entrySet().stream()
                .map(Map.Entry::getValue)
                .flatMap(List::stream)
                .collect(Collectors.toList());
    }
}
