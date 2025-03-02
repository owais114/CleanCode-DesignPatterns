package org.nexusbank.facade;

public class BankAccount {

    private String accountNumber;
    private double balance;
    private boolean isActive;

    public BankAccount(String accountNumber, double balance, boolean isActive) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.isActive = isActive;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public boolean isActive() {
        return this.isActive;
    }

    public boolean debit(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        } else {
            System.out.println("Insufficient funds");
            return false;
        }
    }

    public void credit(double amount) {
        balance += amount;
    }

    public boolean transferTo(BankAccount recipient, double amount) {
        if (debit(amount)) {
            recipient.credit(amount);
            return true;
        }
        return false;
    }

}