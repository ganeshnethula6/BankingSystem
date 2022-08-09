package com.gradiousbank.model;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private  long acctId;
    private String name;
    private String city;
    private String phone;
    private Long initialDeposit;
    private List<Account> accounts;

    public Customer() {
    }

    public Customer(long acctId, String name, String city, String phone, Long initialDeposit) {
        this.acctId = acctId;
        this.name = name;
        this.city = city;
        this.phone = phone;
        this.initialDeposit = initialDeposit;
        accounts=new ArrayList<>();
    }

    public long getAcctId() {
        return acctId;
    }

    public void setAcctId(long acctId) {
        this.acctId = acctId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Long getInitialDeposit() {
        return initialDeposit;
    }

    public void setInitialDeposit(Long initialDeposit) {
        this.initialDeposit = initialDeposit;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts.addAll(accounts);
    }
    public Account getAccount(long acctId) throws Exception {
        for (Account acct: accounts) {
            if(acctId==acct.getAcctNumber()){
                return acct;
            }
            else {

            }
        }
        throw new Exception("Account not found");
    }

    public void setAccount(Account account) {
        this.accounts.add(account);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "acctId=" + acctId +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", phone='" + phone + '\'' +
                ", initialDeposit=" + initialDeposit +
                '}';
    }
}
