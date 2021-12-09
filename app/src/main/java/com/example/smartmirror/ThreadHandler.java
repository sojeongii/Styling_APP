package com.example.smartmirror;

public class ThreadHandler {

    private static virtualfittingThread thread = new virtualfittingThread();

    public static virtualfittingThread getThread() {
        return thread;
    }
}
