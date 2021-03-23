package org.example.labs.mockito;

import java.util.Scanner;

public class SystemInWrapper {

    private Scanner scanner = new Scanner(System.in);

    public String nextLine(){
        return scanner.nextLine();
    }
}
