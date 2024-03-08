package com.objects.basics;

import java.util.Arrays;
import java.util.Scanner;

public class EmployeeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee []employeeList = new Employee[3];
        for (int i=0;i<employeeList.length;i++){
            System.out.println("Enter employee name: ");
            String name = sc.next();
            System.out.println("Enter employee designation:");
            String designation = sc.next();
            employeeList[i] = new Employee(name, designation);
        }

        System.out.println("Enter your choice of Designation Programmer, Manager or Director");
        String choice = sc.next();


        for (Employee employee: employeeList) {
            switch (choice){
                case "Programmer": System.out.println(employee.calBonus(2300));
                    break;
                case "Manager": System.out.println(employee.calBonus(2000,1000,"Laptop"));
                    break;
                case "Director": System.out.println( employee.calBonus(3400,5600,9000,"Car"));
                    break;
            }
        }
    }
}
