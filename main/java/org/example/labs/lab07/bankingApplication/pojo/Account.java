package org.example.labs.lab07.bankingApplication.pojo;

public class Account {
    private AccountHolder accountHolder;
    private Bank bank;
    private int accountNumber;
    private double balance;
    private double interestRate;

    public Account() {
    }

    public Account(AccountHolder accountHolder, int accountNumber, double balance, double interestRate) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public AccountHolder getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(AccountHolder accountHolder) {
        this.accountHolder = accountHolder;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "name='" + accountHolder.getName() + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                ", interestRate=" + interestRate +
                '}';
    }
}
