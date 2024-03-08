package com.oops.basics;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee = new Employee("Nithin", 2345, 30000);

        System.out.println(employee.greet("Welcome"));
        employee.getDetails();
    }
}
