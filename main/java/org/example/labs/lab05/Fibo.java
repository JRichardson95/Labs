package org.example.labs.lab05;

public class Fibo {


    public long run(int n){
        return run(1,n);
    }

    public long run(int start, int n){
        return run(start, start,n);
    }

    public long run(int f1, int f2, int n){
        int a = f1;
        int b = f2;
        int c = 0;
        for(int i = 1; i <= n; i++){
            //System.out.println(a);
            c = a + b;
            a = b;
            b = c;
        }
        return c-a;
    }



    public double goldenRatio(int n){
        return (double) run(n)/ run(n-1);
    }

}
