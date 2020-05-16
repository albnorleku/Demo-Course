package com.javaCourse.concurrency;

public class SynchronizedDemo {
    public static void main(String[] args) {
        Thread th1 = new Thread(() -> {
            //synchronized (SynchronizedDemo.class) {
                printSomething();
                System.out.println("Thread-one finished");
            //}
        });
        th1.setName("Thread-one");

        Thread th2 = new Thread(() -> {
            //synchronized (SynchronizedDemo.class) {
                printSomething();
                System.out.println("Thread-two finished");
            //}
        });
        th2.setName("Thread-two");

        th1.start();
        th2.start();
    }

    public static synchronized void printSomething() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Printing number form thread " +
                    Thread.currentThread().getName() + " -> " + i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
