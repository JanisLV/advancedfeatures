package com.company.threads;

public class HelloPrinter implements Runnable {
    private int id;
    private volatile boolean flag = true;

    public HelloPrinter(int id) {
        this.id = id;
    }

    public void stopPrinting(){
        flag = false;
    }

    public void changeId(){
        id++;
    }

    @Override
    public void run() {
        System.out.println("Hello!" + id);
        while (flag){
            changeId();
            try {
                Thread.sleep(1500l);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("New value = " + id);
        }
    }
}
