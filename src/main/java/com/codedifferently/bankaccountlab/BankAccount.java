package com.codedifferently.bankaccountlab;

public abstract class BankAccount {

    private String accountNumber;
    private double fees;
    private String name;
    private float balance;
    private String pin;

    public abstract String getAccountNumber();
    public abstract double getAnnualFees();
    public abstract String getAccountHolderName();
    public abstract double getBalance();
    public abstract void setAccountNumber();
}
