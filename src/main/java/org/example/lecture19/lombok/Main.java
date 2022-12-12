package org.example.lecture19.lombok;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(1,15);
        Point point2 = new Point(1,15);

        System.out.println(point1.equals(point2));
    }
}
