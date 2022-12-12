package org.example.lecture16;

import org.example.lecture15.User;

import java.util.Optional;

public class Example8 {
    public static void main(String[] args) {

        Optional<User> userOpt = findUser();

        if(userOpt.isPresent()) {
            System.out.println(userOpt.get());
        } else {
            System.out.println("empty");
        }

        //userOpt.ifPresent(System.out::println);
        userOpt.ifPresentOrElse(System.out::println, () -> System.out.println("empty"));

    }


    public static Optional<User> findUser() {
        return Optional.empty();
    }
 }
