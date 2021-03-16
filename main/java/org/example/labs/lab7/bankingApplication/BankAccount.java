package org.example.labs.lab7.bankingApplication;

import java.util.ArrayList;
import java.util.Scanner;

public class BankAccount {
    private AccountHolder accountHolder;
    private int accountNumber;
    private double balance;
    private double interestRate;

    public BankAccount() {
    }

    public BankAccount(AccountHolder accountHolder, int accountNumber, double balance, double interestRate) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.interestRate = interestRate;
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

    public void transfer (BankAccount account, double transfer) throws Exception {
        if(!((this.getBalance()-transfer) < 0)){
            this.setBalance(this.getBalance() - transfer);
            account.setBalance(account.getBalance() + transfer);
        } else {
            throw new Exception("Not enough funds");
        }
    }

    public double interestEarned(){
        double interestAfterOneYear = 0.00;
        for (int i = 0; i < 12; i++){
            interestAfterOneYear = (balance * interestRate);
        }
        return interestAfterOneYear - balance;
    }

    public BankAccount createNewAccount(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("customer name: ");
        accountHolder.setName(scanner.next());
        System.out.println("Account number: ");
        accountNumber = scanner.nextInt();
        System.out.println("Balance: ");
        balance = scanner.nextDouble();
        System.out.println("Interest rate: ");
        interestRate = scanner.nextDouble();
        return this;
    }

    public static void allAccounts(ArrayList<BankAccount> accounts){
        accounts.forEach((account) ->
                System.out.println(account.getAccountNumber() + "\n" + account.interestEarned()));
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
