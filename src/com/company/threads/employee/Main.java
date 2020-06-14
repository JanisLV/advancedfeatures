package com.company.threads.employee;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        List<Employee> employeeList = new ArrayList<>(List.of(
                new Employee("John"),
                new Employee("Janis"),
                new Employee("Michal"),
                new Employee("Dwight"),
                new Employee("Andy")
        ));

        for (Employee employee : employeeList) {
            Thread t = new Thread(employee);
            t.start();
        }

        Thread.sleep(30_000l);

        Employee employee = employeeList.get(0);
        employee.stopWorking();
        employeeList.remove(employee);
    }
}
