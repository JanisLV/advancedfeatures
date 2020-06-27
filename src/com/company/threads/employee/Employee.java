package com.company.threads.employee;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee implements Runnable {
    private String name;
    private long workingSpeed = 1_000l;
    private volatile boolean flag = true;

    public Employee(String name) {
        this.name = name;
    }

    public void stopWorking() {
        flag = false;
    }

    public void workFaster(){
        if(workingSpeed < 200){
            return;
        }
        workingSpeed = workingSpeed - 200l;
    }

    @Override
    public void run() {
        SimpleDateFormat format = new SimpleDateFormat("HH:mm");
        System.out.println(name +
                " - I came to work at "
                + format.format(new Date()));
        while (flag) {
            try {
                Thread.sleep(workingSpeed);
                System.out.println(name + " - I'm still working!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(name + ":" + format.format(new Date()) + ", it's" +
                "time to go home!”");


    }

    public String getName() {
        return name;
    }
}
