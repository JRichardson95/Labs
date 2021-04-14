package org.example.labs.tdd;

import org.example.labs.tdd.exception.NegativeNumberException;

import java.util.ArrayList;
import java.util.List;


public class StringCalculator {

    private int sum = 0;
    private char delimiter;

    public int add(String numbers) throws NegativeNumberException {
        if (numbers.length() == 0) return 0;
        if (containsNegative(numbers)) {
            throw new NegativeNumberException("You entered a negative number " + getListOfNegatives(numbers).toString());
        }
        if (checkForDelimiter(numbers)) {
            delimiter = delimiter(numbers);
        }
        return sum(stringArrayToNumberList(numbers));
    }

    public int sum(List<Integer> numberList) {
        for (Integer integer : numberList) {
            sum += integer;
        }
        return sum;
    }

    public boolean checkForDelimiter(String numbers) {
        return (numbers.charAt(0) == '/' && numbers.charAt(1) == '/');
    }

    public char delimiter(String numbers) {
        return numbers.charAt(2);
    }

    public List<Integer> stringArrayToNumberList(String numbers) {
        String[] StringNumbers = splitString(numbers);
        List<Integer> ints = new ArrayList<>();
        for (String s : StringNumbers) {
            try {
                ints.add(Integer.parseInt(s));
            } catch (Exception e) {
            }
        }
        return ints;
    }

    public String[] splitString(String numbers) {
        delimiter = delimiter(numbers);
        return removeSpecialCharacters(numbers).split("[" + delimiter + "]");
    }

    public String removeSpecialCharacters(String numbers) {
        numbers = numbers.replaceAll("[//]", "");
        numbers = numbers.replaceAll("[\\n ]", "");
        return numbers;
    }

    public boolean containsNegative(String numbers) {
        return numbers.contains("-");
    }

    public List<Integer> getListOfNegatives(String numbers){
        String[] StringNumbers = splitString(numbers);
        List<Integer> ints = new ArrayList<>();
        for (String s : StringNumbers) {
            if (s.contains("-"))
            try {
                ints.add(Integer.parseInt(s));
            } catch (Exception e) {
            }
        }
        return ints;
    }

    public void printNegatives(String numbers) {
        for (int i = 0; i < numbers.length(); i++) {
            if (numbers.charAt(i) == '-') {
                System.out.println("-" + numbers.charAt(i + 1));
            }
        }
    }


}
