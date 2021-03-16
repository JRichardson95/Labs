package org.example.labs.lab7.bankingApplication;

import java.util.ArrayList;

public class Start {
    public static void main(String[] args) {
        AccountHolder accountHolder1 = new AccountHolder("Jay", 25);
        AccountHolder accountHolder2 = new AccountHolder("Test",24);
        AccountHolder accountHolder3 = new AccountHolder("Test1",23);
        AccountHolder accountHolder4 = new AccountHolder("Test2",22);

        BankAccount account = new BankAccount(accountHolder1, 1023, 1000.50, 1.1);
        BankAccount account1 = new BankAccount(accountHolder2, 1022, 44.66, 1.02);

        System.out.println(account.toString() + "\n");
        try{
            account.transfer(account1, 11.00);
        } catch (Exception e){
            System.out.println(e +"\n");
        }
        System.out.println(account.toString() + "\n");
        System.out.println(account1.toString() + "\n");

        System.out.println(account.interestEarned());

        BankAccount test = new BankAccount().createNewAccount();

        System.out.println(test.toString());

        ArrayList<BankAccount> listOfAccount = new ArrayList<BankAccount>();
        listOfAccount.add(account);
        listOfAccount.add(account1);
        listOfAccount.add(test);

        BankAccount.allAccounts(listOfAccount);

    }
}
