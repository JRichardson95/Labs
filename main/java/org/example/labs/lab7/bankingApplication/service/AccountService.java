package org.example.labs.lab7.bankingApplication.service;

import org.example.labs.lab7.bankingApplication.pojo.Account;
import org.example.labs.lab7.bankingApplication.pojo.AccountHolder;

import java.util.ArrayList;
import java.util.Scanner;

public class AccountService {

    public Account createNewAccount() {
        Account newAccount = new Account();
        Scanner scanner = new Scanner(System.in);
        System.out.println("customer name: ");
        newAccount.setAccountHolder(new AccountHolder(scanner.next()));
        System.out.println("Account number: ");
        newAccount.setAccountNumber(scanner.nextInt());
        System.out.println("Balance: ");
        newAccount.setBalance(scanner.nextDouble());
        System.out.println("Interest rate: ");
        newAccount.setInterestRate(scanner.nextDouble());
        return newAccount;
    }

    public void deposit(Account account, double deposit) {
        double newBalance = account.getBalance() + deposit;
        account.setBalance(newBalance);
    }

    public void withdraw(Account account, double amount) throws Exception {
        if (balanceCheck(account, amount)) {
            account.setBalance(account.getBalance() - amount);
        } else {
            throw new Exception("Not enough funds");
        }
    }

    public void transfer(Account account1, Account account2, double transfer) throws Exception {
        if (balanceCheck(account1, transfer)) {
            withdraw(account1, transfer);
            deposit(account2, transfer);
        } else {
            throw new Exception("Not enough funds");
        }
    }

    public boolean balanceCheck(Account account, double amount) {
        return (account.getBalance() - amount) >= 0;
    }

    public double interestEarned(Account account) {
        double interestAfterOneYear = 0.00;
        for (int i = 0; i < 12; i++) {
            interestAfterOneYear = (account.getBalance() * account.getInterestRate());
        }
        return interestAfterOneYear - account.getBalance();
    }

    public void allAccounts(ArrayList<Account> accounts) {
        accounts.forEach((account) ->
                System.out.println(account.getAccountNumber() + "\n" + interestEarned(account)));
    }

}
