package org.example.lecture20.module2.ex2;

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

    // CPU intensive operations (at most number of CPU cores)
    // Browser -> http request -> server -> new thread (reuse) -> ... -> http response - 200
    // lightweight threads (fiber - project loom)

    // thread safe vs non thread safe code

    static Statistics statistics = new Statistics();

    public static void main(String[] args) throws InterruptedException {
        final StatisticsOutputWriter statisticsOutputWriter = new StatisticsOutputWriter(statistics, 1);
        statisticsOutputWriter.setDaemon(true);
        statisticsOutputWriter.start();

        final List<Thread> cExecutionThreads = IntStream.range(0,20)
                .mapToObj(j -> new Thread(() -> {
                    for(int i = 0; i < 10000; i++) {
                        methodC();
                    }
                })).collect(Collectors.toList());

        cExecutionThreads.forEach(Thread::start);

        for (Thread cExecutionThread : cExecutionThreads) {
            cExecutionThread.join();
        }

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

    public   void incrementNumberOfMethodСExecutions() {
        numberOfMethodСExecutions++;
    }
}

@Slf4j
@RequiredArgsConstructor
class StatisticsOutputWriter extends Thread {

    private final Statistics statistics;
    private final int rateInSeconds;
    private boolean needRun = true;
    private boolean paused = false;

    @SneakyThrows
    @Override
    public void run() {
        while(needRun) {
            //if NumberOfMethodCExecutions > 1000, set to 0 and show alert
            while (paused) {
                TimeUnit.SECONDS.sleep(5);
            }
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

    public void pause() {
        log.info("paused");
        paused = true;
    }
    public void unpause() {
        log.info("unpaused");
        paused = false;
    }
}
