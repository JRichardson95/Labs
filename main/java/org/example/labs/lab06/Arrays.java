package org.example.labs.lab06;

public class Arrays {

    public void testArray() {
        long[] row = new long[4];
        row[2] = 3;
        System.out.println("Before: " + row[2]);
        long[] copy = row;
        copy[2]++;
        System.out.println("After: " + row[2]);
        try {
            System.out.println("Value of row[4]: " + row[4]);
        } catch (Exception e) {
            System.out.println("Out of range");
        }

    }

    public long[] doubleSize(long[] row) {
        long[] row2 = new long[row.length * 2];
        for (int i = 0; i != row2.length; i++) {
            if (i < row.length) {
                if (row[i] != 0) {
                    row2[i] = row[i];
                }
            } else {
                row2[i] = 0;
            }
        }
        return row2;
    }

    public long[] multiply(long[] input, int multiplier){
        long[] multipliedRow = new long[input.length];
        for (int i = 0; i != input.length; i++){
            multipliedRow[i] = input[i] * multiplier;
        }
        return multipliedRow;
    }


    public void print(long[] array){
        for(int i = 0; i != array.length; i++){
            System.out.println(array[i]);
        }
    }
}
