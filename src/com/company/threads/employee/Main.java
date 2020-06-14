package com.company.threads.employee;

public class Main {
    public static void main(String[] args) {

        Employee john = new Employee("John");
        Thread t1 = new Thread(john);
        t1.start();
    }
}
