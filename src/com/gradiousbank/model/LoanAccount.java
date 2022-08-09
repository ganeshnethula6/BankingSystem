package com.gradiousbank.model;

public class LoanAccount extends Account {
    public LoanAccount() {
    }

    public LoanAccount(long acctNumber, String acctType, long acctBalance) {
        super(acctNumber, acctType, acctBalance);
    }

    public boolean deposit(long amount){
        if (amount >= 0) {
            this.setAcctBalance(this.getAcctBalance()+amount);;
            return true;
        }
        else {
            return false;
        }
    }
    public boolean withdraw(long amount){
        if (this.getAcctBalance() >= amount) {
            this.setAcctBalance(this.getAcctBalance()-amount);
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
}
