package org.example.lecture19.threads.ex1;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class Main {
    public static void main(String[] args) {
        //.class -> JIT -> JVM
        // thread 1
        methodA();

        // thread 2
        methodC();

        long count = List.of(1, 2, 3).parallelStream()
                .filter(i -> i > 2)
                .count();

        //BusinessLogicExecutor().execute();
    }

    public static void methodA() {
        log.info("methodA started");
        methodB();
        log.info("methodA ended");
    }


    public static void methodB() {
        log.info("methodB started");
        // long database operation
        log.info("methodB ended");
    }

    public static void methodC() {
        log.info("methodC started");
        log.info("methodC ended");
    }
}