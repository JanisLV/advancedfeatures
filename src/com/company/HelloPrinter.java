package com.company;

public class HelloPrinter implements Runnable {

    int numner;

    public HelloPrinter(int numner) {
        this.numner = numner;
    }

    private void inc() {
        numner++;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("Hello " + numner);
            inc();
            try {
                Thread.sleep(1000l);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
