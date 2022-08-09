package com.gradiousbank.model;

public class Bank {
    private long acctNumber;
    private  String bankName;
    private long branchCode;
    private String city;

    public Bank() {

    }

    public Bank(long acctNumber, String bankName, long branchCode, String city) {
        this.acctNumber = acctNumber;
        this.bankName = bankName;
        this.branchCode = branchCode;
        this.city = city;
    }

    public Account openAccount(Customer customer, String acctType){
        Account account;
        if (acctType == "loan") {
            account = new LoanAccount(this.getAcctNumber(), acctType, 0);
        }
        else if (acctType == "deposit") {
            account = new DepositAccount(this.getAcctNumber(), acctType, 0);
        }
        else {
            account = new CreditAccount(this.getAcctNumber(), acctType, 0);
        }
        customer.setAccount(account);
        return account;

    }

    public long getAcctNumber() {
        return acctNumber;
    }

    public void setAcctNumber(long acctNumber) {
        this.acctNumber = acctNumber;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public long getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(long branchCode) {
        this.branchCode = branchCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "acctNumber=" + acctNumber +
                ", bankName='" + bankName + '\'' +
                ", branchCode=" + branchCode +
                ", city='" + city + '\'' +
                '}';
    }
}
