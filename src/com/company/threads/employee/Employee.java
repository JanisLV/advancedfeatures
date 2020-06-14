package com.company.threads.employee;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee implements Runnable {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        SimpleDateFormat format = new SimpleDateFormat("HH:mm");
        System.out.println(name +
                " - I came to work at "
                        + format.format(new Date()));
    }
}
