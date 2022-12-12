package org.example.lecture21.module3.ex1;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;

// Broken! - How long would you expect this program to run?
@Slf4j
public class StopThreadBroken {
    private static boolean stopRequested;

    public static void main(String[] args) throws InterruptedException {
        Thread backgroundThread = new Thread(() -> {
            int i = 0;
            while (!stopRequested) {
                i++;
            }
            log.info("Background Thread Stopped. Finally!");
        });

        log.info("Starting background thread");
        backgroundThread.start();
        TimeUnit.SECONDS.sleep(1);
        log.info("Waited for 1 second, it's time to request stop");
        stopRequested = true;
    }
}
