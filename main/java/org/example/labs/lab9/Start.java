package org.example.labs.lab9;

import org.example.labs.lab7.Person.Gender;
import org.example.labs.lab7.Person.Person;

import java.io.IOException;

public class Start {
    public static void main(String[] args) {
        new Start().lab9();
    }

    public void lab9(){
            Person p = new Person("Jan", 45 , Gender.MALE);
            Person q = new Person("Piet", 35, Gender.MALE);
            Person o = new Person("Unknown", 0);

    }

}
