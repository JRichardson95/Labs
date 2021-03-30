package org.example.labs.lab12;

import org.example.labs.lab07.Person.Gender;

public class App {
    public static void main(String[] args) {
        new App().start();

    }

    private void start() {
        Person p = new Person("Jan", 45, Gender.MALE);
        
//        System.out.println(p.value());

        System.out.println(p.getMessage());
    }
}
