package org.example.lecture19.threads.ex4;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;

@Slf4j
public class Main {
    public static void main(String[] args) {
        //.class -> JIT -> JVM
        //new BusinessLogicExecutor().run();
        new BusinessLogicExecutor().start();



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
        TimeUnit.SECONDS.sleep(3);
        log.info("methodB ended");

    }

    public static void methodC() {
        log.info("methodC started");
        log.info("methodC ended");
    }
}

@Slf4j
class BusinessLogicExecutor extends Thread {
    @SneakyThrows
    @Override
    public void run() {
        log.info("BusinessLogicExecutor started");
        TimeUnit.SECONDS.sleep(4);
        log.info("BusinessLogicExecutor ended");
    }
}