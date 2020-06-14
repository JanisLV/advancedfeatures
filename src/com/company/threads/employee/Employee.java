package com.company.threads.employee;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee implements Runnable {
    private String name;
    private volatile boolean flag = true;

    public Employee(String name) {
        this.name = name;
    }

    public void stopWorking(){
        flag = false;
    }

    @Override
    public void run() {
        SimpleDateFormat format = new SimpleDateFormat("HH:mm");
        System.out.println(name +
                " - I came to work at "
                + format.format(new Date()));
        while (flag) {
            try {
                Thread.sleep(10_000l);
                System.out.println(name + " - I'm still working!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
