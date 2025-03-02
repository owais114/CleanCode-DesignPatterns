package org.nexusbank.facade;

public class TransactionProcessor {

    private final TransactionManager transactionManager;

    public TransactionProcessor(TransactionManager transactionManger) {
        this.transactionManager = transactionManger;
    }

    public void executeTransaction(BankAccount sender, BankAccount recipient, double amount) {
        if (sender.isActive() && recipient.isActive()) {
            boolean success = transactionManager.processFundTransfer(sender, recipient, amount);
            if (success) {
                System.out.printf("%.2f transferred successfully from %s to %s\n", amount, sender.getAccountNumber(), recipient.getAccountNumber());
                System.out.printf("Updated Balances: Sender: %.2f | Recipient: %.2f\n", sender.getBalance(), recipient.getBalance());
            } else {
                System.out.println("Transaction failed");
            }
        } else {
            System.out.println("One or both accounts are inactive");
        }
    }

}