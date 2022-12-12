package org.example.lecture20.module1.ex3;

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

    public static void main(String[] args) throws InterruptedException {
        final StatisticsOutputWriter statisticsOutputWriter = new StatisticsOutputWriter(statistics, 1);
        //statisticsOutputWriter.setDaemon(true);
        statisticsOutputWriter.start();

        // never user method stop()!!!!!!!

        final List<Thread> cExecutionThreads = IntStream.range(0,20)
                .mapToObj(i -> new Thread(() -> {
                    while (true) {
                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        methodC();
                    }
                })).collect(Collectors.toList());

        cExecutionThreads.forEach(Thread::start);

        TimeUnit.SECONDS.sleep(10);
        statisticsOutputWriter.finish();
        statisticsOutputWriter.start();

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

    private boolean needRun = true;

    @SneakyThrows
    @Override
    public void run() {
        while(needRun) {
            //if NumberOfMethodCExecutions > 1000, set to 0 and show alert
            log.info("C executed {} time", statistics.getNumberOfMethodСExecutions());
            TimeUnit.SECONDS.sleep(rateInSeconds);
        }
    }

    @Override
    public synchronized void start() {
        needRun = true;
        super.start();
    }

    public void finish() {
        log.info("finished");
        needRun = false;
    }
}