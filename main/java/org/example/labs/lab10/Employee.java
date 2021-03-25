package org.example.labs.lab10;

import org.example.labs.lab7.Person.Gender;

public class Employee extends Person{
    public Employee(String name, int age) {
        super(name, age);
    }

    public Employee(String name, int age, Gender gender) {
        super(name, age, gender);
    }

    @Override
    public String greet(){
        return "I'm tired of working. This is inhuman!";
    }
}
