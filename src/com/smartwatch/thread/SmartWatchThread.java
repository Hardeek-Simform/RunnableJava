package com.smartwatch.thread;

public class SmartWatchThread implements Runnable {
    private String featureName;
    private int requiredTime;

    public SmartWatchThread(String featureName, int requiredTime) {
        this.featureName = featureName;
        this.requiredTime = requiredTime;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " = Feature name : " + featureName);
        while (requiredTime >= 0) {
            try {
                requiredTime--;
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(Thread.currentThread().getName() + " = " + featureName + " : Completed the task");

    }
}
