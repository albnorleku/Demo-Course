package com.javaCourse.concurrency;

public class ThreadDemoClass extends Thread {
    private Thread thread;
    private String threadName;
    private int waitTime;

    public ThreadDemoClass(String threadName, int waitTime) {
        this.threadName = threadName;
        this.waitTime = waitTime;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("Thread " + threadName + " -> " + i);
                Thread.sleep(waitTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void start() {
        thread = new Thread(this, threadName);
        thread.start();
    }
}
