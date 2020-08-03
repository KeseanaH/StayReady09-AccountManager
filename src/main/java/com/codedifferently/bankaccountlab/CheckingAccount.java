package com.codedifferently.bankaccountlab;

public class CheckingAccount extends Account {

    public CheckingAccount(String name, double balance, int pin){
        super(name, balance, pin);
    }

    public CheckingAccount(String name, int pin){
        super(name, pin);
    }

    public String printAccountInfo(){
        String info = String.format("Name: %s    Balance: %.2f    Pin: %d", getName(), getBalance(), getPin());
        return info;
    }
}