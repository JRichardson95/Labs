package org.example.labs.lab10;

import org.example.labs.lab07.Person.Gender;

public class Teacher extends Person {

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String name, int age, Gender gender) {
        super(name, age, gender);
    }
}
