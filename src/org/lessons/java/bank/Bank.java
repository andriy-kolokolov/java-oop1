package org.lessons.java.bank;

import java.util.Random;

public class Bank {
    private final int bankAccountId;
    private String accountName;
    private double balance = 0;

    public Bank(String accountName) {
        this.bankAccountId = new Random().nextInt(10000);
        this.accountName = accountName;
    }

    public Bank() {
        this.bankAccountId = new Random().nextInt(10000);
    }

    @Override
    public String toString() {
        return "Info: " +
                "\n - bankAccountId: " + bankAccountId +
                "\n - accountName: " + accountName +
                "\n - balance: " + balance;
    }

    public void topUpBalance(double amount) {
        balance += amount;
    }

    public void withdrawFromAccount(double amount) {
        try {
            if (amount > balance) {
                throw new InsufficientFundsException("Withdrawal amount exceeds available balance");
            }
            balance -= amount;
        } catch (InsufficientFundsException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public int getBankAccountId() {
        return bankAccountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getBalance() {
        return balance;
    }
}

