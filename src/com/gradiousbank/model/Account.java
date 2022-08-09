package com.gradiousbank.model;

public class Account {
    private long acctNumber;
    private String acctType;
    private long acctBalance;

    public Account() {
    }

    public Account(long acctNumber, String acctType, long acctBalance) {
        this.acctNumber = acctNumber;
        this.acctType = acctType;
        this.acctBalance = acctBalance;
    }

    public boolean deposit(long amount){
        if (amount >= 0) {
            this.acctBalance += amount;
            return true;
        }
        else {
            return false;
        }
    }
    public boolean withdraw(long amount){
        if (this.acctBalance >= amount) {
            this.acctBalance -= amount;
            return true;
        }
        else {
            return false;
        }
    }
    public boolean transferTo(long amount, Account destAcct) {
        boolean withdraw = this.withdraw(amount);
        boolean dep = destAcct.deposit(amount);
        if (dep && withdraw) {
            return true;
        }
        else {
            return false;
        }
    }

        public long getAcctNumber() {
        return acctNumber;
    }

    public void setAcctNumber(long acctNumber) {
        this.acctNumber = acctNumber;
    }

    public String getAcctType() {
        return acctType;
    }

    public void setAcctType(String acctType) {
        this.acctType = acctType;
    }

    public long getAcctBalance() {
        return acctBalance;
    }

    public void setAcctBalance(long acctBalance) {
        this.acctBalance = acctBalance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "acctNumber=" + acctNumber +
                ", acctType='" + acctType + '\'' +
                ", acctBalance=" + acctBalance +
                '}';
    }
}
