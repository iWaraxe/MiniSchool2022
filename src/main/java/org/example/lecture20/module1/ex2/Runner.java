package org.example.lecture20.module1.ex2;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Slf4j
public class Runner {

    static Statistics statistics = new Statistics();

    public static void main(String[] args) {

        StatisticsOutputWriter statisticsOutputWriter = new StatisticsOutputWriter(statistics, 1);
        statisticsOutputWriter.start();

        List<Thread> cExecutionThreads = IntStream.range(0, 20)
                .mapToObj(i -> new Thread(() -> {
                    while (true) {
                        try {
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        methodC();
                    }
                })).collect(Collectors.toList());

        cExecutionThreads.forEach(Thread::start);

        System.out.println(statistics.getNumberOfMethodСExecutions());
    }

    public static void methodC() {
        //log.info("methodC started");
        statistics.incrementNumberOfMethodСExecutions();
        //log.info("methodC ended");
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
            TimeUnit.SECONDS.sleep(rateInSeconds);
        }
    }
}
