package org.example.labs.lab4.hourglass;

import org.example.labs.lab4.exception.EvenNumberException;

import java.util.Scanner;

public class Hourglass {
    int tryCounter = 3;

    public void askNumber(){
        Scanner scanner = new Scanner(System.in);
        if (tryCounter != 0){
            System.out.println("Please enter an odd number: ");
            try {
                int numberInput = scanner.nextInt();
                evenCheck(numberInput);
            } catch (Exception e){
                tryCounter--;
                System.out.println("Please enter a valid number");
                askNumber();
            }
        }else{
            System.out.println("Too many wrong attempts");
        }
    }

    public void evenCheck(int numberToCheck) throws EvenNumberException {
        if (numberToCheck % 2 == 0) {
            tryCounter--;
            throw new EvenNumberException("Please enter an even number");
        } else {
            print(numberToCheck);
        }
    }

    public void print(int length) {
        char[] hourglass = new char[length];
        int j = 1;

        for (int l = 1; l != hourglass.length; l++) {
            if (l == 1) {
                for (int i = 0; i != hourglass.length; i++) {
                    hourglass[i] = '*';
                }
                System.out.println(hourglass);
            }
            if (l == hourglass.length - 1) {
                for (int i = 0; i != hourglass.length; i++) {
                    hourglass[i] = '*';
                }
            } else {
                for (int i = 0; i != hourglass.length; i++) {
                    if (i == hourglass.length - (hourglass.length - j)) {
                        hourglass[i] = '-';
                    } else if (i == hourglass.length - (j + 1)) {
                        hourglass[i] = '+';
                    } else {
                        hourglass[i] = ' ';
                    }
                }
            }
            j++;
            System.out.println(hourglass);
        }
    }

}
