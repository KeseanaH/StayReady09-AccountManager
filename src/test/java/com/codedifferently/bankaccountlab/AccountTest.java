package com.codedifferently.bankaccountlab;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AccountTest {
    Account acc;

    @Test
    public void constructorTest1(){
        Account acc = new Account("Shania", 7854);

        String actualN = acc.getAccountHolderName();
        double actualB = acc.getBalance();
        int actualP = acc.getPin();

        String expectedN = "Shania";
        double expectedB = 5.00;
        int expectedP = 7854;

        Assert.assertEquals(expectedN, actualN);
        Assert.assertEquals(expectedB, actualB, 0);
        Assert.assertEquals(expectedP, actualP, 0);
        Assert.assertNotNull(acc.getAccountNumber());
    }
    
    @Before
    public void initialize(){
        acc = new Account("Greg", 175.00, 4512);
    }

    @Test
    public void constructorTest2(){

        String actualN = acc.getAccountHolderName();
        double actualB = acc.getBalance();
        int actualP = acc.getPin();

        String expectedN = "Greg";
        double expectedB = 175.00;
        int expectedP = 4512;

        Assert.assertEquals(expectedN, actualN);
        Assert.assertEquals(expectedB, actualB, 0);
        Assert.assertEquals(expectedP, actualP, 0);
        Assert.assertNotNull(acc.getAccountNumber());
    }

    @Test
    public void getBalanceTest(){

        double actual = acc.getBalance();
        double expected = 175.00;

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void getSetAccountNumberTest(){

        acc.setAccountNumber("4519858736");

        String actual = acc.getAccountNumber();
        String expected = "4519858736";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAccountHolderNameTest(){

        String actual = acc.getAccountHolderName();
        String expected = "Greg";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getSetAnnualFeesTest(){

        acc.setAnnualFees(7.00);
        double actual = acc.getAnnualFees();
        double expected = 7.00;

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void setPin(){

        acc.setPin(1592);
        int actual = acc.getPin();
        int expected = 1592;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getPin(){

        int actual = acc.getPin();
        int expected = 4512;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setAccountNumberTest(){

        acc.setAccountNumber();
        
        Assert.assertNotNull(acc.getAccountNumber());
    }

    @Test
    public void accountNumberAlreadyExistsTest(){

        Account acc2 = new Account("Becc", 8543);
        
        Assert.assertNotEquals(acc2.getAccountNumber(), acc.getAccountNumber());
    }

    @Test
    public void depositTest(){
        acc.deposit(25.00);

        double actual = acc.getBalance();
        double expected = 200.00;

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void withdrawalTest(){
        acc.withdrawal(50.00);

        double actual = acc.getBalance();
        double expected = 125.00;

        Assert.assertEquals(expected, actual, 0);
    }
}