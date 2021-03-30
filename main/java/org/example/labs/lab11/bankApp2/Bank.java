package org.example.labs.lab11.bankApp2;


public class Bank {
    private String name;
//    private ArrayList<Account> accounts = new ArrayList<Account>();


    public abstract class BankAccount {
        private AccountHolder accountHolder;
        private Bank bank;
        private int accountNumber;
        private double balance;
    }

    private class CheckingAccount extends BankAccount{

    }

    private class SavingsAccount extends  BankAccount{
        private double interestRate;
    }
}
