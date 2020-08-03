package com.codedifferently.bankaccountlab;

import org.junit.Assert;
import org.junit.Test;

public class DisplayTest {
    @Test
    public void addToAccountsTest(){
        Display d = new Display();
        CheckingAccount ca = new CheckingAccount("Ben", 250.00, 5491);

        d.addToAccounts(ca);

        int actual = d.getAccounts().size();
        int expected = 1; 

        Assert.assertEquals(expected, actual);
    }
}