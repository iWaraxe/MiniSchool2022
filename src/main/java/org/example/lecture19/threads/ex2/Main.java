package org.example.lecture19.threads.ex2;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) {
        //.class -> JIT -> JVM
        log.info("Hello from main");
        final Thread thread = Thread.currentThread();
        System.out.println(thread.getName());

        methodA();

        methodC();
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
    }}
