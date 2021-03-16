package org.example.labs.lab7.Person;

import java.util.Objects;

public class Person {

    private String name;
    private int age;
    private Gender gender;
    final static int MAXIMUM_AGE = 131;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.gender = Gender.UNKNOWN;
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
        if (this == o) return true;
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
}
