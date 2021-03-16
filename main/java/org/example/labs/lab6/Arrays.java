package org.example.labs.lab6;

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

    public void doubleSize(long[] row) {
        long[] doubleRow = new long[row.length * 2];
        for (int i = 0; i != doubleRow.length; i++) {
            if (i < row.length) {
                if (row[i] != 0) {
                    doubleRow[i] = row[i];
                }
            } else {
                doubleRow[i] = 0;
            }
            System.out.println(doubleRow[i]);
        }


    }
}
