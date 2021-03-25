package org.example.labs.lab10;

import org.example.labs.lab10.exception.LevelTooHighException;

public class Android extends Human implements Chargeable{

    private int level = 0;

    @Override
    public String greet() {
        return "I'm only half human, but human still...." + "My energy level is "+ level +"%..";
    }

    @Override
    public int charge(int amount) throws LevelTooHighException {
        if((level + amount) <= 100){
            level += amount;
        } else {
            throw new LevelTooHighException("Level can't go above 100");
        }
        return level;
    }

}
