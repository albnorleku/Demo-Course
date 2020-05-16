package com.javaCourse.concurrency;

public class RunnableDemoClass implements Runnable {
    private Thread thread;
    private String threadName;
    private int waitTime;

    public RunnableDemoClass(String threadName, int waitTime) {
        this.threadName = threadName;
        this.waitTime = waitTime;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("Runnable " + threadName + " -> " + i);
                Thread.sleep(waitTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void start() {
        this.thread = new Thread(this, threadName);
        this.thread.start();
        /*try {
            this.thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
    }
}
