package org.bankinghierarchy.composition;

import java.util.ArrayList;
import java.util.List;

public class BankBranch implements AccountComponent {

    private String branchName;
    private List<AccountComponent> accounts = new ArrayList<>();

    public BankBranch(String branchName) {
        this.branchName = branchName;
    }

    public void addAccount(AccountComponent account) {
        accounts.add(account);
    }

    public void removeAccount(AccountComponent account) {
        accounts.remove(account);
    }

    @Override
    public void displayAccountDetails() {
        System.out.printf("=== %s ===%n", branchName);
        for (AccountComponent account : accounts) {
            account.displayAccountDetails();
        }
    }

}