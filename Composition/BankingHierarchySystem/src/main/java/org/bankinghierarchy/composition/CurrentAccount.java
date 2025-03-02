package org.bankinghierarchy.composition;

public class CurrentAccount implements AccountComponent {

    private String accountHolder;
    private double balance;

    public CurrentAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    @Override
    public void displayAccountDetails() {
        System.out.printf("Current Account - Holder: %s | Balance: $%.2f%n", accountHolder, balance);
    }

}
