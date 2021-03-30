package org.example.labs.lab12;

import org.example.labs.lab07.Person.Gender;
import org.example.labs.lab10.Human;

import java.util.Objects;

public class Person extends Human {
    private final String name;
    private int age;
    private Gender gender;
    private String message;
    final static int MAXIMUM_AGE = 131;

    @MyAnnotation2
    public void value() {
    }

    public String getMessage() {
        return message;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.gender = Gender.UNKNOWN;
    }

    public Person(String name, int age, Gender gender) {
        this(name, age);
        this.gender = gender;
    }

    public static int getMaximumAge() {
        return MAXIMUM_AGE;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void haveBirthday() throws Exception {
        if ((age+1) != MAXIMUM_AGE){
            setAge(++age);
        } else {
            throw new Exception("PersonDiedException");
        }
    }

    public static int numberOfPossibleGenders(){
        return Gender.values().length;
    }

    @Override
    public String toString() {
        return  name + " (" + age + ") is " + gender;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return age == person.age &&
                name.equals(person.name) &&
                gender == person.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, getAge(), getGender());
    }


    @Override
    public String greet(){
        return "Hello, my name is " + this.name + ". Nice to meet you!";
    }
}
