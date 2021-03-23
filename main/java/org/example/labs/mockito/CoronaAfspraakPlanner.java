package org.example.labs.mockito;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class CoronaAfspraakPlanner {
    SystemInWrapper in = new SystemInWrapper();
    SoutWrapper out = new SoutWrapper();

    public void run(){
        out.print("Wat is uw BSN?: ");
        String BSN = in.nextLine();
        out.printLn("Uw BSN is: " + BSN);
        out.printLn("Uw testafspraak is ingepland op: " + Instant.now().plus(1, ChronoUnit.DAYS));
    }

    public void setIn(SystemInWrapper in) {
        this.in = in;
    }

    public void setOut(SoutWrapper out) {
        this.out = out;
    }
}
