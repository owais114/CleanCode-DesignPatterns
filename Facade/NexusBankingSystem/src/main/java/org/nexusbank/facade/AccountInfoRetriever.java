package org.nexusbank.facade;

public class AccountInfoRetriever {

    private final BankAccount bankAccount;

    public AccountInfoRetriever(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void retrieveAccountInfo() {
        System.out.println("Account Information:");
        if (bankAccount.isActive()) {
            System.out.printf("Account Number: %s \nBalance: %.2f\n", bankAccount.getAccountNumber(), bankAccount.getBalance());
        } else {
            System.out.println("Account is inactive");
        }
    }

}