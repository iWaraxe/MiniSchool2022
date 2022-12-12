package org.example.lecture4;

import java.util.UUID;

public class Runner {
    public static void main(String[] args) {

        User user1 = new User(new UUID(10, 1), "Vasya", "Pupkin");

        User user2 = new User(new UUID(10, 1), "Petya", "Ivanov");

        // 1 - INITIAL, 2 - ACTIVE, 3 - DELETED
        user1.setStatus(UserStatusLegacy.INITIAL);
        user1.setStatus(UserStatusLegacy.ACTIVE);
        user1.setStatus(UserStatusLegacy.DELETED);
        WeekDays monday = WeekDays.MONDAY;
        boolean workingDay = monday.isWorkingDay();
    }
}
