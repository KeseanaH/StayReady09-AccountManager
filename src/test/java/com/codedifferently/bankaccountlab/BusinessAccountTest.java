package com.codedifferently.bankaccountlab;

import org.junit.Assert;
import org.junit.Test;

public class BusinessAccountTest {
    
    @Test
    public void constructorTest(){

        BusinessAccount businessAccount = new BusinessAccount("Greg", 175.00, 4512, "91-2563287");
        
        String actualN = businessAccount.getAccountHolderName();
        double actualB = businessAccount.getBalance();
        int actualP = businessAccount.getPin();
        String actualID = businessAccount.getTaxId();

        String expectedN = "Greg";
        double expectedB = 175.00;
        int expectedP = 4512;
        String expectedID = "91-2563287";

        Assert.assertEquals(expectedN, actualN);
        Assert.assertEquals(expectedB, actualB, 0);
        Assert.assertEquals(expectedP, actualP, 0);
        Assert.assertNotNull(businessAccount.getAccountNumber());
        Assert.assertEquals(expectedID, actualID);
    }

    @Test
    public void constructorTest2(){
        BusinessAccount businessAccount = new BusinessAccount("Shania", 9231, "91-2563287");

        String actualN = businessAccount.getAccountHolderName();
        double actualB = businessAccount.getBalance();
        int actualP = businessAccount.getPin();
        String actualID = businessAccount.getTaxId();

        String expectedN = "Shania";
        double expectedB = 5.00;
        int expectedP = 9231;
        String expectedID = "91-2563287";

        Assert.assertEquals(expectedN, actualN);
        Assert.assertEquals(expectedB, actualB, 0);
        Assert.assertEquals(expectedP, actualP, 0);
        Assert.assertNotNull(businessAccount.getAccountNumber());
        Assert.assertEquals(expectedID, actualID);
    }

    @Test
    public void getTaxIdTest(){
        BusinessAccount businessAccount = new BusinessAccount("Shania", 9231, "91-2563287");

        String actual = businessAccount.getTaxId();
        String expected = "91-2563287";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void printAccountInfoTest(){
        BusinessAccount businessAccount = new BusinessAccount("Shania", 250.00, 9231, "91-2563287");

        String actual = businessAccount.printAccountInfo();
        String expected = "Name: Shania    Balance: 250.00    Pin: 9231    TaxId: 91-2563287";

        Assert.assertEquals(expected, actual);
    }
}