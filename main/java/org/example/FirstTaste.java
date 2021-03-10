package org.example;

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

}
