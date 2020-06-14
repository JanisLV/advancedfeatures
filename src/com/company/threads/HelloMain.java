package com.company.threads;

public class HelloMain {
    public static void main(String[] args) {
        HelloPrinter helloPrinter = new HelloPrinter();
        Thread t = new Thread(helloPrinter);
        t.start();
    }
}
