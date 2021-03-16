package org.example.labs.lab3;

public class TypeSystem {

    public void before(){
        int a;
        int i = 0;

        System.out.println("This is ++i");

        for(a  = 0; a <= 3; a++){
            System.out.println(++i);
        }
    }

    public void after(){
        int a;
        int i = 0;

        System.out.println("\nThis is i++");

        for(a  = 0; a <= 3; a++){
            System.out.println(i++);
        }
    }


    public void whatIsThis(){
        int i = 1;
        for (int a = 0; a < 20; a++) {
            int j = i < 3 ? i++ + ++i : ++i >>> 1;
            System.out.println(j);
        }
    }

    public void binaryCalc(){
        System.out.println(0b1010 + 0b100);
    }

//    public void timePassed(){
//        Date
//    }

    public void range(){
        System.out.println("Byte");
        System.out.println("Byte min: " + Byte.MIN_VALUE);
        System.out.println("Byte max: " + Byte.MAX_VALUE+"\n");

        System.out.println("int");
        System.out.println("int min: " + Integer.MIN_VALUE);
        System.out.println("int max: " + Integer.MAX_VALUE+"\n");

        System.out.println("long");
        System.out.println("long min: " + Long.MIN_VALUE);
        System.out.println("long max: " + Long.MAX_VALUE+"\n");

        System.out.println("short");
        System.out.println("short min: " + Short.MIN_VALUE);
        System.out.println("short max: " + Short.MAX_VALUE+"\n");

        System.out.println("double");
        System.out.println("double min: " + Double.MIN_VALUE);
        System.out.println("double max: " + Double.MAX_VALUE+"\n");

        System.out.println("float");
        System.out.println("float min: " + Float.MIN_VALUE);
        System.out.println("float max: " + Float.MAX_VALUE+"\n");

        System.out.println("char");
        System.out.println("char min: " + Character.MIN_VALUE);
        System.out.println("char max: " + Character.MAX_VALUE+"\n");
    }

}
