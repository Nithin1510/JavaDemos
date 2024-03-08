package com.util.list;

public class Customer {

    private String name;

    private String customerID;

    private String city;

    public Customer(){

    }

    public Customer(String name, String customerID, String city) {
        this.name = name;
        this.customerID = customerID;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", customerID='" + customerID + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
