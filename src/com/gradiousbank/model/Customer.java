package com.gradiousbank.model;

public class Customer {
    private  long acctId;
    private String name;
    private String city;
    private String phone;
    private Long initialDeposit;
    public Customer(long acctId, String name, String city, String phone, Long initialDeposit) {
        this.acctId = acctId;
        this.name = name;
        this.city = city;
        this.phone = phone;
        this.initialDeposit = initialDeposit;
    }

}
