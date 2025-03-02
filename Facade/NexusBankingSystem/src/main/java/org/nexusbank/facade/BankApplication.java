package org.nexusbank.facade;

public class BankApplication {
    public static void main(String[] args) {
        System.out.println("Executing Facade Pattern with SOLID Principles.");

        TransactionManager transactionManager = new TransactionManager();

        BankAccount senderAccount = new BankAccount("9876543210", 5000, true);
        BankAccount recipientAccount = new BankAccount("1234567890", 2000, true);

        AccountInfoRetriever accountInfoRetriever = new AccountInfoRetriever(senderAccount);
        accountInfoRetriever.retrieveAccountInfo();

        TransactionProcessor transactionProcessor = new TransactionProcessor(transactionManager);
        transactionProcessor.executeTransaction(senderAccount, recipientAccount, 4000);

    }
}