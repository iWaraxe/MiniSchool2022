package org.example.lecture22.domain;

import java.time.LocalDate;

public class UserUtils {
    public static User[] findUsersWithDateOfBirth(User[] users, LocalDate dateOfBirth) {
        throw new UnsupportedOperationException("not implemented yet");
    }

    public static User[] findUsersWithStatuses(User[] users, UserStatus... statuses) {
        UserStatus[] arr = statuses;
        throw new UnsupportedOperationException("not implemented yet");
    }

    public static User[] findActiveUsersWithDateOfBirth(User[] users, LocalDate dateOfBirth) {
        throw new UnsupportedOperationException("not implemented yet");
    }

    public static User[] findUsersWithDateOfBirthAndStatus(User[] users, LocalDate dateOfBirth, UserStatus status) {
        return findUsersWithDateOfBirth(users, dateOfBirth);
    }
}
