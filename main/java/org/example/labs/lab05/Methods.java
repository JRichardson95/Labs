package org.example.labs.lab05;

import java.util.ArrayList;

public class Methods {

    public int greatest(int a, int b){
        if (a > b ){
            return a;
        } else {
            return b;
        }
    }

    public String greatest( String a, String b){
        if(a.length()> b.length()){
            return a;
        } else {
            return b;
        }
    }

    public int greatest(ArrayList<Integer> intList){
        int result = 0;
//        intList.forEach((i) ->  );
        for(int i = 0; i != intList.size(); i++){
            if(intList.get(i) > result){
                result = intList.get(i);
            }
        }
        return result;
    }

    public int factorial(int n){
        int result = n;
        for(int i = 1; i != n; i++){
            result = result * (n-i);
        }
        return result;
    }


}
