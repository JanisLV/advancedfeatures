package com.company.threads;

public class HelloPrinter implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello!");
    }
}
