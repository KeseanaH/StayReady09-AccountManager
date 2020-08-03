package com.codedifferently.bankaccountlab;

import org.junit.Assert;
import org.junit.Test;

public class SavingsAccountTest {
    
    @Test
    public void constructorTest(){

        SavingsAccount savingsAccount = new SavingsAccount("Greg", 175.00, 4512);
        
        String actualN = savingsAccount.getAccountHolderName();
        double actualB = savingsAccount.getBalance();
        int actualP = savingsAccount.getPin();
        double actualR = savingsAccount.getRate();

        String expectedN = "Greg";
        double expectedB = 175.00;
        int expectedP = 4512;
        double expectedR = 1.00;

        Assert.assertEquals(expectedN, actualN);
        Assert.assertEquals(expectedB, actualB, 0);
        Assert.assertEquals(expectedP, actualP, 0);
        Assert.assertNotNull(savingsAccount.getAccountNumber());
        Assert.assertEquals(expectedR, actualR, 0);
    }

    @Test
    public void constructorTest2(){
        SavingsAccount savingsAccount = new SavingsAccount("Shania", 9231);

        String actualN = savingsAccount.getAccountHolderName();
        double actualB = savingsAccount.getBalance();
        int actualP = savingsAccount.getPin();
        double actualR = savingsAccount.getRate();

        String expectedN = "Shania";
        double expectedB = 5.00;
        int expectedP = 9231;
        double expectedR = 1.00;

        Assert.assertEquals(expectedN, actualN);
        Assert.assertEquals(expectedB, actualB, 0);
        Assert.assertEquals(expectedP, actualP, 0);
        Assert.assertNotNull(savingsAccount.getAccountNumber());
        Assert.assertEquals(expectedR, actualR, 0);
    }

    @Test
    public void getRateTest(){
        SavingsAccount savingsAccount = new SavingsAccount("Shania", 9231);

        double actual = savingsAccount.getRate();
        double expected = 1.00;

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void printAccountInfoTest(){
        SavingsAccount savingsAccount = new SavingsAccount("Shania", 175.00, 9231);

        String actual = savingsAccount.printAccountInfo();
        String expected = "Name: Shania    Balance: 175.00    Pin: 9231    Rate: 1.00";

        Assert.assertEquals(expected, actual);
    }
}