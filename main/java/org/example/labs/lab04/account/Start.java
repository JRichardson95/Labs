package org.example.labs.lab04.account;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        AccountNumber an = new AccountNumber();
        Scanner in = new Scanner(System.in);

        System.out.println("Enter accountnumber");
        String accountNumber = in.nextLine();

        an.toArrayList(accountNumber);
    }

}
