package org.example.labs.lab07.bankingApplication.pojo;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Account> accounts = new ArrayList<Account>();

    public Bank(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(Account account) {
        this.accounts.add(account);
    }
}
