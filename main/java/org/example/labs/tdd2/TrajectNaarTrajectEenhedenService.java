package org.example.labs.tdd2;

import java.util.Random;

public class TrajectNaarTrajectEenhedenService {
    public int getTrajectEenheden(String from, String to){
        return new Random().nextInt(10);
    }
}
