package org.example.lecture4;

public enum WeekDays {
    MONDAY(1, true),
    TUESDAY(2, true),
    WEDNESDAY(3, true),
    THURSDAY(4, true),
    FRIDAY(5, true),
    SATURDAY(6, false),
    SUNDAY(7,false);

    private final int number;
    private final boolean workingDay;

    WeekDays(int number, boolean workingDay) {
        this.number = number;
        this.workingDay = workingDay;
    }

    public int getNumber() {
        return number;
    }

    public boolean isWorkingDay() {
        return workingDay;
    }
}
