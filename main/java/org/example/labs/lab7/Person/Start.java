package org.example.labs.lab7.Person;

public class Start {
    public static void main(String[] args) {
        new Start().lab7();
    }

    public void lab7(){
        Person p = new Person("Jan", 44);
        System.out.println(p.getGender());
        p.setGender(Gender.MALE);
        System.out.println(p.getGender());
        try {
            p.haveBirthday();
            System.out.println(p.getAge());
        } catch (Exception e){
            System.out.println(e);
        }

        System.out.println(Person.numberOfPossibleGenders());
    }
}
