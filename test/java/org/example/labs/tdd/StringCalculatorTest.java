package org.example.labs.tdd;

import org.example.labs.tdd.exception.NegativeNumberException;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    StringCalculator stringCalculator = new StringCalculator();

    @Test
    void addNumbersWithNewLine() throws NegativeNumberException {
        Assert.assertEquals(6 , stringCalculator.add("1\n2,3"));
    }

    @Test
    void returnNullIfStringEmpty() throws NegativeNumberException {
        Assert.assertEquals(0, stringCalculator.add(""));
    }

    @Test
    void addNumbersWithDelimiters() throws NegativeNumberException {
        Assert.assertEquals(15, stringCalculator.add("//;\n1;2;12"));
    }

    @Test
    void checkIfDelimiterIsPresent(){
        Assert.assertTrue(stringCalculator.checkForDelimiter("//;\n1;2"));
    }

    @Test
    void printDelimiter(){
        Assert.assertEquals(';', stringCalculator.delimiter("//;\n1;2"));
    }

    @Test
    void stringHasNegative(){
        Assert.assertTrue(stringCalculator.containsNegative("//;\n-1;2"));
    }

}