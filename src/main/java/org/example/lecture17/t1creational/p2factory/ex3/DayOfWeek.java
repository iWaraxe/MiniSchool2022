package org.example.lecture17.t1creational.p2factory.ex3;

public enum DayOfWeek {
    MONDAY(0),
    TUESDAY(1),
    WEDNESDAY(2),
    THURSDAY(3),
    FRIDAY(4),
    SATURDAY(5),
    SUNDAY(6);

    private final Integer index;

    DayOfWeek(Integer index) {
        this.index = index;
    }

    public Integer getIndex() {
        return index;
    }

}
