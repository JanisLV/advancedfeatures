package com.company.threads;

public class HelloMain {
    public static void main(String[] args) throws InterruptedException {
        HelloPrinter helloPrinter1 = new HelloPrinter(1);
        Thread t1 = new Thread(helloPrinter1);
        t1.start();
        helloPrinter1.stopPrinting();

        HelloPrinter helloPrinter2 = new HelloPrinter(1);
        Thread t2 = new Thread(helloPrinter2);
        t2.start();
        Thread.sleep(4000l);
        helloPrinter2.stopPrinting();
    }
}
