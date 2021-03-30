package org.example.labs.lab13;

import org.example.labs.lab10.Android;
import org.example.labs.lab10.Human;

public class House<T extends Human> {
    T owner;

    public House(T owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        if(owner instanceof Android){
            return "This house is owned by [an Android]" + " and it says [" + owner.greet() + "]";
        }
        return "This house is owned by [" + owner.toString() + "]" + " and it says [" + owner.greet() + "]";
    }
}
