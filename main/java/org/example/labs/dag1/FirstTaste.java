package org.example.labs.dag1;

public class FirstTaste {
    int aantalReizigers;
    float perWagon;

    public void doeIets(){
         perWagon = ((float) aantalReizigers) / 4;
         print();
    }

    public void doeNogIets(){
        perWagon = aantalReizigers / 5f;
        print();
    }

    public void print(){
        System.out.println("\n");
        System.out.println("Aantal reizigers is :  " + aantalReizigers);
        System.out.println("Aantal reizigers per wagon: " + perWagon);
    }

    public void advancedHello(String[] Args){
        if(Args.length != 0){
            for(int i = 0 ; i <= Args.length; i++){
                System.out.println("Hello " + Args[i]);
            }
        } else {
            System.out.println("Hello World");
        }
    }

}
