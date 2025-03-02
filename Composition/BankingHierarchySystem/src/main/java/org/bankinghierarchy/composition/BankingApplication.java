package org.bankinghierarchy.composition;

public class BankingApplication {
    public static void main(String[] args) {
        System.out.println("Executing Composition Pattern with SOLID Principles in Banking System...");

        AccountComponent acc1 = new SavingsAccount("Owais", 500);
        AccountComponent acc2 = new CurrentAccount("Hamza", 543);
        AccountComponent acc3 = new SavingsAccount("Hanzala", 8000);
        AccountComponent acc4 = new CurrentAccount("Ashfaq", 432);

        BankBranch bahadurabadBranch = new BankBranch("Bahadurabad Branch");
        bahadurabadBranch.addAccount(acc1);
        bahadurabadBranch.addAccount(acc2);
        bahadurabadBranch.addAccount(acc3);

        BankBranch mainBranch = new BankBranch("Main Branch");
        mainBranch.addAccount(bahadurabadBranch);
        mainBranch.addAccount(acc4);

        mainBranch.displayAccountDetails();

    }
}