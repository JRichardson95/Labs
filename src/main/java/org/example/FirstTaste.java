package org.example;

public class FirstTaste {
    int aantalReizigers;
    float perWagon;

    public float getPerWagon() {
        return perWagon;
    }

    public void setPerWagon(float perWagon) {
        this.perWagon = perWagon;
    }

    public void doeIets(){
         setPerWagon(((float) aantalReizigers) / 4);

        System.out.println("Aantal reizigers is :  " + aantalReizigers);
        System.out.println("Aantal reizigers per wagon: " + getPerWagon());
    }
}
