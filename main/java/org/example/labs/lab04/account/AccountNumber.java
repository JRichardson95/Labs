package org.example.labs.lab04.account;

import java.util.ArrayList;

public class AccountNumber {
    ArrayList numberArrayList = new ArrayList<Integer>();
    int total = 0;

    public void checkAccountNumber(){
        if(total % 11 == 0){
            System.out.println("Valid accountnumber");
        }else{
            throw new IllegalArgumentException();
        }
    }

    public void toArrayList(String accountNumber){
        String number;
        for(int i = 0 ; i != accountNumber.length(); i++){
            number = String.valueOf(accountNumber.charAt(i));
            if(number.equals(".")){
                ++i;
                number = String.valueOf(accountNumber.charAt(i));
            }
            numberArrayList.add(Integer.valueOf(number));
        }
        toArray();
    }

    public void toArray(){
        int[] accountArray = new int[numberArrayList.size()];
        System.out.println("\n");
        for (int i = 0; i != numberArrayList.size(); i++){
         accountArray[i] = Integer.valueOf(numberArrayList.get(i).toString());
         accountArray[i] = accountArray[i] * (9 - i);
            total = total + accountArray[i];
        }
        checkAccountNumber();
    }


}
