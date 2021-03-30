package org.example.labs.lab13;

import org.example.labs.lab07.Person.Gender;
import org.example.labs.lab10.Android;
import org.example.labs.lab10.Employee;
import org.example.labs.lab10.Person;
import org.example.labs.lab10.Teacher;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
//        new App().startHouse();
        new App().startMyIntCollection();
    }

    private void startHouse() {
        House<Person>hp = new House<>(new Person("Piet", 10));

        List<House> houseList = new ArrayList<>();
        houseList.add(new House(new Person("Piet", 10)));
        houseList.add(new House(new Person("Jan", 45)));
        houseList.add(new House(new Android()));
        houseList.add(new House(new Employee("Henk", 30, Gender.MALE)));
        houseList.add(new House((new Teacher("Truus", 28, Gender.FEMALE))));

        for (House house: houseList) {
            System.out.println(house.toString());
        }
    }

    private void startMyIntCollection(){
        MyIntCollection intCollection = new MyIntCollection();

        for (int i = 0; i < 9; i++) {
            intCollection.add(i+1);
        }

        System.out.println(intCollection.toString());
    }
}
