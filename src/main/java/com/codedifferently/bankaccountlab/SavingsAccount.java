package com.codedifferently.bankaccountlab;

public class SavingsAccount extends Account {
    private final double rate;

    public SavingsAccount(String name, double balance, int pin){
        super(name, balance, pin);
        rate = 1.00;
    }

    public SavingsAccount(String name, int pin){
        super(name, pin);
        rate = 1.00;
    }

    public double getRate(){
        return rate;
    }

    public String printAccountInfo(){
        String info = String.format("Name: %s    Balance: %.2f    Pin: %d    Rate: %.2f", getName(), getBalance(), getPin(), getRate());
        return info;
    }
}