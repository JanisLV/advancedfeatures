package com.company.threads;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Bench bench = new Bench(1); // creating bench with one free seat
        SeatTakerThread seatTaker1 = new SeatTakerThread(bench, " John");
        SeatTakerThread seatTaker2 = new SeatTakerThread(bench, "Michal");
        seatTaker1.start();
        seatTaker2.start();
    }
}
