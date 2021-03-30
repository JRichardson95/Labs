package org.example.labs.lab11;

import org.example.labs.lab10.Human;
import org.example.labs.lab07.Person.Gender;


public class Person extends org.example.labs.lab10.Person {

        HistoryRecord[] history = new HistoryRecord[10];
        int arrayCount;

    public void setArrayCount(int arrayCount) {
        this.arrayCount = arrayCount;
    }

    public Person(String name, int age) {
            super(name, age);
            arrayCount = 0;
        }

        public Person(String name, int age, Gender gender) {
            super(name, age, gender);
        }

        public void addHistory(String description){
            history[arrayCount] = new HistoryRecord(description);
            setArrayCount(++arrayCount);
        }

        public void printHistory(){
            for (HistoryRecord description : history) {
                if(description != null) System.out.println(description);
            }
        }

    public Human createSubHuman(){
        Human human = new Human(){
            @Override
             public String greet(){
                return "Sub is the best.";
            }
        };
        return human;
    }



        private class HistoryRecord{
            String description;

            private HistoryRecord(String description){
                this.description = description;
            }

            @Override
            public String toString(){
                return description;
            }

        }

    }

