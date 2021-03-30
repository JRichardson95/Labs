package org.example.labs.tdd2;

public class Main {
    public static void main(String[] args) {
        new Main().startApp();
    }

    public void startApp(){
        int result  = new TrajectPrijsService().getTrajectPrijs("Amsterdam", "Apeldoorn");
        System.out.println(result);
    }
}
