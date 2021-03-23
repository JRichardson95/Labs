package org.example.labs.mockito;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;


class CoronaAfspraakPlannerTest {
    CoronaAfspraakPlanner target;
    SystemInWrapper in = mock(SystemInWrapper.class);
    SoutWrapper out = mock(SoutWrapper.class);

    @BeforeEach
    void setUp() {
        target = new CoronaAfspraakPlanner();
        target.setIn(in);
        target.setOut(out);
        when(in.nextLine()).thenReturn("1234");
    }

    @Test
    void printFirstLine(){
        target.run();
        verify(out, times(1)).print(anyString());
    }

    @Test
    void askInput() {
        target.run();
        verify(in, times(1)).nextLine();
    }

    @Test
    void printBSN(){
        target.run();
        verify(out, times(1)).printLn(contains("1234"));
    }

    @Test
    void printDate(){
        target.run();
        verify(out).printLn(contains("2021"));
    }

}