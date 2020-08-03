package com.codedifferently.bankaccountlab;

import org.junit.Assert;
import org.junit.Test;

public class CheckingAccountTest {
    
    @Test
    public void constructorTest(){

        CheckingAccount checkingAccount = new CheckingAccount("Greg", 175.00, 4512);
        
        String actualN = checkingAccount.getAccountHolderName();
        double actualB = checkingAccount.getBalance();
        int actualP = checkingAccount.getPin();

        String expectedN = "Greg";
        double expectedB = 175.00;
        int expectedP = 4512;

        Assert.assertEquals(expectedN, actualN);
        Assert.assertEquals(expectedB, actualB, 0);
        Assert.assertEquals(expectedP, actualP, 0);
        Assert.assertNotNull(checkingAccount.getAccountNumber());
    }

    @Test
    public void constructorTest2(){
        CheckingAccount checkingAccount = new CheckingAccount("Shania", 9231);

        String actualN = checkingAccount.getAccountHolderName();
        double actualB = checkingAccount.getBalance();
        int actualP = checkingAccount.getPin();

        String expectedN = "Shania";
        double expectedB = 5.00;
        int expectedP = 9231;

        Assert.assertEquals(expectedN, actualN);
        Assert.assertEquals(expectedB, actualB, 0);
        Assert.assertEquals(expectedP, actualP, 0);
        Assert.assertNotNull(checkingAccount.getAccountNumber());
    }

    @Test
    public void printAccountInfoTest(){
        CheckingAccount checkingAccount = new CheckingAccount("Shania", 9231);

        String actual = checkingAccount.printAccountInfo();
        String expected = "Name: Shania    Balance: 5.00    Pin: 9231";

        Assert.assertEquals(expected, actual);
    }
}