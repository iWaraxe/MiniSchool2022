package org.example.lecture20.module1.ex1;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;

@Slf4j
public class Runner {

    static Statistics statistics = new Statistics();

    public static void main(String[] args) {

        new StatisticsOutputWriter(statistics,1).start();

        methodA();
        methodC();
        System.out.println(statistics.getNumberOfMethodСExecutions());
    }

    public static void methodA() {
        log.info("methodA started");
        /////
        methodB();
        /////
        log.info("methodA ended");
    }

    @SneakyThrows
    public static void methodB() {
        log.info("methodB started");
        long result = 0;
        TimeUnit.SECONDS.sleep(3);
        log.info("methodB ended");

    }

    public static void methodC() {
        log.info("methodC started");
        statistics.incrementNumberOfMethodСExecutions();
        log.info("methodC ended");
    }
}

class Statistics {
    @Getter
    private int numberOfMethodСExecutions;

    public void incrementNumberOfMethodСExecutions() {
        numberOfMethodСExecutions++;
    }
}

@Slf4j
@RequiredArgsConstructor
class StatisticsOutputWriter extends Thread {

    private final Statistics statistics;
    private final int rateInSeconds;

    @SneakyThrows
    @Override
    public void run() {
        while(true) {
            log.info("C executed {} time", statistics.getNumberOfMethodСExecutions());
        }
    }
}
