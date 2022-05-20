package com.ctac.banking;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountTest {
    BankAccount b = new BankAccount("Joe Shmoe", 100, 1);
    BankAccount a = new BankAccount("Jane Shmoe", 500, 2);

    @Test
    void testDeposit() {
        b.deposit(100);
        assertEquals(b.getBalance(), 200);
    }

    @Test
    void testTransfer() {
        b.transfer(a, 100);
        assertEquals(a.getBalance(), 600);
    }
}
