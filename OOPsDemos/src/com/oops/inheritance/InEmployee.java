package com.oops.inheritance;

public class InEmployee {
    String employeeName;
    int employeeId;
    public InEmployee(String employeeName, int employeeId) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
    }

    public InEmployee() {

    }

    void getDetails(){
        System.out.println("Employee name : "+employeeName);
        System.out.println("Employee id : "+employeeId);
    }
}
