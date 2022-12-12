package org.example.lecture16;

import org.example.lecture15.User;

import java.util.List;
import java.util.Optional;

public class Example9 {
    public static void main(String[] args) {
        // User loadFromDb;
        //final Optional<User> userOptional = Optional.of(new User("Jaime"));
        final Optional<User> userOptional = Optional.ofNullable(null);

        System.out.println(userOptional);

        User jaime1 = userOptional.orElse(new User("Jaime"));
        User jaime2 = userOptional.orElseGet(() -> new User("Jaime"));

        String username = "    JaimeJaime  ";
        System.out.println(produceUser(username));

        Optional<Integer> any = List.of(1, 2, 3, 4, -5, -6).stream()
                .filter(i -> i < 0)
                .findAny();

        boolean b = List.of(1, 2, 3, 4, -5, -6).stream()
                .anyMatch(i -> i < 0);
        System.out.println(b);


    }

    public static User produceUser(String username) {
        String sanitize = Optional.ofNullable(username)
                .map(String::trim)
                .filter(s -> s.length() < 10)
                .orElse("default");
        //return new User(username != null ? username : "default");
        return new User(sanitize);
    }
}
