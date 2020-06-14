package com.company.threads;

public class SeatTakerThread extends Thread{
    private String name;
    private Bench bench;


    public SeatTakerThread(Bench bench, String name) {
        this.bench = bench;
        this.name = name;
    }
    @Override
    public void run() {
        System.out.println(name + " is taking a seat.");
        bench.takeASeat();
    }
}
