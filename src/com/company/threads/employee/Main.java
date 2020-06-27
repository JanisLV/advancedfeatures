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

        for (int i = employeeList.size() - 1; i >= 0; i--) {
            Thread.sleep(3_000l);
            Employee employee = null;
            for (Employee employeeFromList : employeeList) {
                if("Andy".equals(employeeFromList.getName())){
                    employee = employeeFromList;
                }
            }
            employee.stopWorking();
            employeeList.remove(employee);
            for (Employee employeeStillWorking : employeeList) {
                employeeStillWorking.workFaster();
            }
        }

    }
}
