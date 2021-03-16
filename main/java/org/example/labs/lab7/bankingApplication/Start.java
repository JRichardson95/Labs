package org.example.labs.lab7.bankingApplication;

import org.example.labs.lab7.bankingApplication.model.AccountHolder;
import org.example.labs.lab7.bankingApplication.model.Account;
import org.example.labs.lab7.bankingApplication.service.AccountService;

import java.util.ArrayList;

public class Start {
    public static void main(String[] args) {
        AccountHolder accountHolder1 = new AccountHolder("Jay");
        AccountHolder accountHolder2 = new AccountHolder("Test");
        AccountHolder accountHolder3 = new AccountHolder("Test1");
        AccountHolder accountHolder4 = new AccountHolder("Test2");

        Account account = new Account(accountHolder1, 1023, 1000.50, 1.1);
        Account account1 = new Account(accountHolder2, 1022, 44.66, 1.02);
        AccountService accountService = new AccountService();

        System.out.println(account.toString() + "\n");
        try{
            accountService.transfer(account, account1, 11.00);
        } catch (Exception e){
            System.out.println(e +"\n");
        }
        System.out.println(account.toString() + "\n");
        System.out.println(account1.toString() + "\n");

        System.out.println(accountService.interestEarned(account));

        Account test = new AccountService().createNewAccount();

        System.out.println(test.toString());

        ArrayList<Account> listOfAccount = new ArrayList<Account>();
        listOfAccount.add(account);
        listOfAccount.add(account1);
        listOfAccount.add(test);

        accountService.allAccounts(listOfAccount);

    }
}
