package com.codedifferently.bankaccountlab;

public class BusinessAccount extends Account {
    
    private String taxId;

    public BusinessAccount(String companyName, double balance, int pin, String taxId){
        super(companyName, balance, pin);
        this.taxId = taxId;
    }

    public BusinessAccount(String companyName, int pin, String taxId){
        super(companyName, pin);
        this.taxId = taxId;
    }

    public String getTaxId(){
        return taxId;
    }

    public String printAccountInfo(){
        String info = String.format("Name: %s    Balance: %.2f    Pin: %d    TaxId: %s", getName(), getBalance(), getPin(), getTaxId());
        return info;
    }
}