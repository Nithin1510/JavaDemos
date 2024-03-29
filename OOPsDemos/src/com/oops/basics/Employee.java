package com.oops.basics;

public class Employee {
    String employeeName;
    int employeeId;

    public Employee(String employeeName, int employeeId, double salary) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    double salary;

    void getDetails(){
        System.out.println("Name "+employeeName);
        System.out.println("EmployeeId "+employeeId);
        System.out.println("Salary "+salary);
    }

    String greet(String message){
        return message+ " "+ employeeName;
    }
}
