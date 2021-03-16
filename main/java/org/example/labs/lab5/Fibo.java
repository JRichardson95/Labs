package org.example.labs.lab5;

public class Fibo {


    public int run(int n){
        return run(1,n);
    }

    public int run(int start, int n){
        return run(start, start,n);
    }

    public int run(int f1, int f2, int n){
        int a = f1;
        int b = f2;
        int c = 0;
        for(int i = 1; i <= n; i++){
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
        }
        return c-a;
    }

//    public void goldenRatio(double golden){
//        System.out.println(golden/(golden-1));
//    }

}
