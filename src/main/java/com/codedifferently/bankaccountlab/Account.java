package com.codedifferently.bankaccountlab;

import java.util.ArrayList;
import java.util.Random;

public class Account extends BankAccount{

    private String accountNumber;
    private double fees;
    private String name;
    private double balance;
    private int pin;
    private ArrayList<Account> accountNumbers;

    public Account(String name, double balance, int pin) {
        setAccountNumber();
        this.name = name;
        this.balance = balance;
        this.pin = pin;
    }

    public Account(String name, int pin) {
        setAccountNumber();
        this.name = name;
        balance = 5.00;
        this.pin = pin;
    }

    public String getName(){
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return name;
    }

    public double getAnnualFees() {
        return fees;
    }

    protected void setAnnualFees(double fees) {
        this.fees = fees;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public int getPin() {
        return pin;
    }

    protected void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountNumber() {

        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int randNum = random.nextInt(10) + 0;
            accountNumber += randNum;
        }

        if (accountNumberAlreadyExists(accountNumber))
            setAccountNumber();
    }

    public boolean accountNumberAlreadyExists(String accNum) {

        if (accountNumbers!= null) {

            for (Account acc : accountNumbers) {
                if (acc.getAccountNumber() == accNum)
                    return true; // if the accountNumber was found
            }
        }

        return false; // accountNumber was NOT found
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdrawal(double amount){
        balance -= amount;
    }
}