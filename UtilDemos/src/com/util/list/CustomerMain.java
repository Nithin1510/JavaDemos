package com.util.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class CustomerMain {

    public static void main(String[] args) {

        List<Customer> customerList = new ArrayList<Customer>();

        List<Customer> customerByCity = new ArrayList<>();

        Customer customer1 = new Customer("Nithin","30543","Bangalore");

        customerList.add(customer1);
        customerList.add(new Customer("Kumar","45643","Mumbai"));
        customerList.add(new Customer("Reddy","78976","Hyderabad"));
        customerList.add(new Customer("Chandu","21342","Mumbai"));
        customerList.add(new Customer("Cheepati","46456","Bangalore"));

        for (Customer customer: customerList){
            System.out.println(customer);
        }

        for (Customer customer: customerList){
            if(customer.getCity().equals("Mumbai")){
                customerByCity.add(customer);
            }
        }

//        Collections.sort(customerList);
        System.out.println();
        System.out.println("Mumbai objects.........");
        for (Customer customer: customerByCity){
            System.out.println(customer);
        }
    }
}
