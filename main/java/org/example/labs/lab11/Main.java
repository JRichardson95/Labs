package org.example.labs.lab11;

import org.example.labs.lab10.Human;
import org.example.labs.lab7.Person.Gender;

public class Main {
    public static void main(String[] args) {
        new Main().start();
    }

    private void start() {
        Person p = new Person("Jan", 45, Gender.MALE);
        System.out.println(p.toString());
        p.addHistory("history");
        p.addHistory("history1");
        p.addHistory("history2");
        p.addHistory("history3");
        p.addHistory("history4");
        p.printHistory();
        Human test = p.createSubHuman();
        System.out.println(test.greet());

    }
}
