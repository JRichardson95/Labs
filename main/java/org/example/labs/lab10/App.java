package org.example.labs.lab10;

import org.example.labs.lab10.exception.LevelTooHighException;
import org.example.labs.lab07.Person.Gender;

import java.util.List;

public class App {
    public static void main(String[] args) throws LevelTooHighException {
        new App().start();
    }

    private void start() throws LevelTooHighException {
        List<Human> characters = List.of(
                new Person("Jan", 46, Gender.MALE),
                new Employee("Harry", 32, Gender.MALE),
                new Teacher("Truus", 28, Gender.FEMALE),
                new Android()
                );



        for (Human character : characters) {
            if (character instanceof Android){
                ((Android) character).charge(45);
                try {
                    ((Android) character).charge(60);
                } catch (Exception e ){
                    System.out.println(e);
                }
            }
            System.out.println(character.greet());
        }
    }
}
