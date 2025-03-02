package org.nexusbank.facade;

public class TransactionManager {

    public boolean processFundTransfer(BankAccount sender, BankAccount recipient, double amount) {
        return sender.transferTo(recipient, amount);
    }

}