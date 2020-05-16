package com.javaCourse.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ConcurrencyDemo {
    public static void main(String[] args) {
        ThreadDemoClass th1 = new ThreadDemoClass("thread-1", 600);
        //ThreadDemoClass th2 = new ThreadDemoClass("thread-3",  500);

        RunnableDemoClass r1 = new RunnableDemoClass("thread-2", 200);
        //RunnableDemoClass r2 = new RunnableDemoClass("thread-4", 400);


        th1.start();
        //th2.start();
        r1.start();
        //r2.start();

        Thread th5 = new Thread(() -> {
            //kod qe ekzekutohet eshte ne thread te ri.
            synchronMethod(300);
        });

        Runnable th6 = () -> {
            synchronMethod(400);
        }; // executes in main thread.
        th5.setName("thread-3");
        th5.start();
        th6.run();

        //synchronMethod(200); // main thread
        //synchronMethod(500); // main thread

        ExecutorService executorService = Executors.newFixedThreadPool(4);
        for(int i = 0; i < 5; i++) {
            executorService.execute(() -> {
                synchronMethod(100);
            });
        }

    }

    private static void synchronMethod(int sleepTime) {
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("Thread " + Thread.currentThread().getName() + " -> " + i);
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
