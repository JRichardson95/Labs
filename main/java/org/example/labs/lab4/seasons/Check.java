package org.example.labs.lab4.seasons;

public class Check {


    public void checkSeason(Seasons season){
        switch (season){
            case SPRING:
                System.out.println(Seasons.SPRING.getDescription());
                break;
            case SUMMER:
                System.out.println(Seasons.SUMMER.getDescription());
                break;
            case FALL:
                System.out.println(Seasons.FALL.getDescription());
                break;
            case WINTER:
                System.out.println(Seasons.WINTER.getDescription());
                break;
            default:
                System.out.println("unknown");
        }
    }
}
