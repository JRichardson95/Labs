package org.example.labs.lab6;

public class Start {
    public static void main(String[] args) {
        Arrays arrays = new Arrays();

        long[] firstArray = new long[4];
        for (int i = 0; i!=firstArray.length;i++){
            firstArray[i]=i+1;
        }

        System.out.println("This is the first Array[]:");
        arrays.print(firstArray);


        //arrays.testArray();

        long[] secondArray = new Arrays().doubleSize(firstArray);

        System.out.println("This is the second Array[]:");
        arrays.print(secondArray);

        System.out.println("This is the multiplied Array[]:");
        arrays.print(arrays.multiply(secondArray, 2));
    }
}
