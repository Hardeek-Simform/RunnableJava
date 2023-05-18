package com.smartwatch;

import com.smartwatch.thread.SmartWatchThread;

public class Main {
    public static void main(String[] args) {
        SmartWatchThread checkHeartPulse = new SmartWatchThread("Checking Heart Pulse", 5);
        SmartWatchThread stepCount = new SmartWatchThread("Checking Step Count", 1);
        SmartWatchThread checkAndroidNotification = new SmartWatchThread("Checking Android notifications", 3);
        Thread heartThread = new Thread(checkHeartPulse);
        Thread stepThread = new Thread(stepCount);
        Thread notificationThread = new Thread(checkAndroidNotification);
        heartThread.start();
        stepThread.start();
        notificationThread.start();
    }
}