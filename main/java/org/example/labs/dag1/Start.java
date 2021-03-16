package org.example.labs.dag1;

import java.lang.reflect.Array;

public class Start {

    public static void main(String[] args) {

            FirstTaste ft1 = new FirstTaste();
            FirstTaste ft2 = new FirstTaste();


            ft1.aantalReizigers = 30;
            ft2.aantalReizigers = 60;

            if(args.length == 0);

            ft1.doeIets();
            ft2.doeNogIets();

    }

}
