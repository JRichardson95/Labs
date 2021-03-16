package org.example.labs.lab6;

public class Start {
    public static void main(String[] args) {
        long[] test = new long[4];
        for (int i = 0; i!=test.length;i++){
            test[i]=i+1;
        }
        Arrays arrays = new Arrays();
        arrays.testArray();

        arrays.doubleSize(test);
    }
}
