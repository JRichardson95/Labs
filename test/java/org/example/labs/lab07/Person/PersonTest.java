package org.example.labs.lab07.Person;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void getGender() {
    }

    @Test
    public void setGender() {
    }

    @Test
    public void getAge() {
    }

    @Test
    public void setAge() {
    }

    @Test
    public void haveBirthday() {
    }

    @Test
    public void numberOfPossibleGenders() {
    }

    @Test
    public void testPerson(){
        Person p = new Person("Jan", 45);
        System.out.println(p.getGender());
        p.setGender(Gender.MALE);
        System.out.println(p.getGender());
        Assert.assertEquals(p.getAge(),45);
        try{
            p.haveBirthday(); // person gets one year older

        }catch (Exception e){
            System.out.println(e);
        }

        System.out.println(p.getAge());
        System.out.println(Person.numberOfPossibleGenders());

    }

    @Test
    public void testPerson1(){
        Person p = new Person("Jan", 45);
        Assert.assertEquals(p.getAge(),45);
        assertNotEquals(p.getAge(),46);
    }
}