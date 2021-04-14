package org.example.labs.tdd;

import org.example.labs.tdd.exception.NegativeNumberException;

import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws NegativeNumberException {
        new App().start();
    }

    private void start() throws NegativeNumberException {
        System.out.println(new StringCalculator().add("//;\n-1;-12"));
//        new StringCalculator().test("//;12;");
//        String[] test = new StringCalculator().splitString("//;\n1;1;-360;-12");
//        System.out.println(Arrays.toString(test));
//        System.out.println(new StringCalculator().add("//;\n1;1;360;12"));
//        List list = new StringCalculator().stringArrayToNumberList(test);
//        for (Object o : list) {
//            System.out.println(o);
//        }

    }
}
