package org.bankinghierarchy.composition;

public class SavingsAccount implements AccountComponent {

    private String accountHolder;
    private double balance;

    public SavingsAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    @Override
    public void displayAccountDetails() {
        System.out.printf("Savings Account - Holder: %s | Balance: $%.2f%n", accountHolder, balance);
    }

}