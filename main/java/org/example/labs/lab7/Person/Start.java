package org.example.labs.lab7.Person;

public class Start {
    public static void main(String[] args) {
        Person p = new Person("Jan", 44);
        Person q = new Person("Jan", 44);
        System.out.println(p.getGender());
        p.setGender(Gender.MALE);
        q.setGender(Gender.MALE);
        System.out.println(p.getGender());
        try {
            p.haveBirthday();
            q.haveBirthday();
            System.out.println(p.getAge());
        } catch (Exception e){
            System.out.println(e);
        }

        System.out.println(p.numberOfPossibleGenders());

        System.out.println(p.toString());
        System.out.println(p.equals(q));
        System.out.println(q.hashCode());

    }
}
