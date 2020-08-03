package com.codedifferently.bankaccountlab;

import java.util.ArrayList;
import java.util.Scanner;

public class Display {

    private ArrayList<Account> accounts = new ArrayList<Account>();
    Scanner sc = new Scanner(System.in);
    String option;
    String name;
    double balance;
    int pin;

    public void openATM(){
        welcomeScreen();
        option = sc.nextLine();

        while(!(option.equalsIgnoreCase("y") || option.equalsIgnoreCase("n"))){
            System.out.print("   That was not one of the options. Enter y for yes, or n for no. ");
            option = sc.nextLine();
        }

        if(option.equalsIgnoreCase("y")){
            System.out.print("\nAwesome, what account do you want to access? ");
            printAccountOptions();
            option = sc.nextLine();
            System.out.println(printAccountInfo(accessAccount()));
        }
        else{
            System.out.print("\nYou need to open an account first. " ); 
            printAccountOptions();
            option = sc.nextLine();
            System.out.println("\t|" + printAccountInfo(createAccount(option)) + " |");
        }
        
        whatsNext();

        while(!(option.equalsIgnoreCase("s"))){
            whatsNext();
        }

    }

    public void welcomeScreen(){
        System.out.print("\nWelcome to the ATM. Do you already have at least one account (y/n)? ");
    }

    public void printAccountOptions(){
        System.out.println("Choose account type: Checking | Savings | Business");
    }

    public Account createAccount(String option){
        Account newAccount = null;
        

        if(option.equalsIgnoreCase("Checking")){

            askToCreate();

            if(balance == 0.00)
                newAccount = new CheckingAccount(name, pin);
            else
                newAccount = new CheckingAccount(name, balance, pin);
        }
        else if(option.equalsIgnoreCase("Savings")){

            askToCreate();

            if(balance == 0.00)
                newAccount = new SavingsAccount(name, pin);
            else
                newAccount = new SavingsAccount(name, balance, pin);
        }
        else if(option.equalsIgnoreCase("Business")){

            askToCreate();

            System.out.print("What is the company's tax id? ");
            String taxId = sc.nextLine();

            if(balance == 0.00)
                newAccount = new BusinessAccount(name, pin, taxId);
            else
                newAccount  = new BusinessAccount(name, balance, pin, taxId);
        }

        addToAccounts(newAccount);
        return newAccount;
    }

    public void askToCreate(){
        System.out.print("Whose name is the account going to be in? ");
        name = sc.nextLine();

        System.out.print("What balance are you opening the account with? ");
        balance = sc.nextDouble();

        System.out.print("What do you want the pin to be? ");
        pin = sc.nextInt();
    }

    public void addToAccounts(Account account){
        accounts.add(account);
    }

    public void deleteAccount(Account account){
        int index = accounts.indexOf(account);
        accounts.remove(index);
    }

    public ArrayList<Account> getAccounts(){
        return accounts;
    }

    public Account getAccount(String name, int pin){
        for(Account a : accounts){
            if(a.getName().equalsIgnoreCase(name)){
                if(a.getPin() == pin)
                    return a;
            }
        }   

        return null;
    }

    public void closeATM(){
        System.out.println("Thank you for using this ATM. Come again!");
    }

    public Account accessAccount(){
        System.out.print("\nWhat name is on the account? ");
        name = sc.nextLine();

        System.out.print("What is the pin? ");
        pin = sc.nextInt();

        Account a = getAccount(name, pin);
        return a;
    }

    public void whatsNext(){
        System.out.println("\nOptions: Access or Create account (A/C)");
        System.out.println("Enter s, if you are done at the atm. ");
        System.out.print("What do you want to do next? ");

        option = sc.next();
        System.out.println(); //buffer

        if(option.equalsIgnoreCase("a")){
            accessAccount();
        }
        else if(option.equalsIgnoreCase("c")){
            printAccountOptions();
            Account a = createAccount(option);
            System.out.println(printAccountInfo(a));
        } 
        else if(option.equalsIgnoreCase("s"))
            closeATM();
    }

    public String printAccountInfo(Account account) {
        if(account instanceof CheckingAccount){
            CheckingAccount checkingAccount = (CheckingAccount) account;
            return checkingAccount.printAccountInfo();
        }
        
        if(account instanceof SavingsAccount){
            SavingsAccount savingsAccount = (SavingsAccount) account;
            return savingsAccount.printAccountInfo();
        }

        if(account instanceof BusinessAccount){
            BusinessAccount businessAccount = (BusinessAccount) account;
            return businessAccount.printAccountInfo();
        }

        return "Account Info NOT found.";
    }
}