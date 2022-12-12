package org.example.lecture19.lombok;

import lombok.*;

@Value
public class User {
    String username;
    String firstname;
    String lastname;
    Age age;

}
