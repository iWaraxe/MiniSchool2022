package org.example.lecture19.threads.ex3;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;

@Slf4j
public class Main {
    public static void main(String[] args) {
        //.class -> JIT -> JVM

        methodA();

        methodC();
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
        TimeUnit.SECONDS.sleep(5);
        log.info("methodB ended");

    }

    public static void methodC() {
        log.info("methodC started");
        log.info("methodC ended");
    }
}
