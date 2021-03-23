package org.example.labs.mockito;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;

import static org.mockito.Mockito.*;


class CoronaAfspraakPlannerTest {
    private static final String BSN = "1234";
    private static final String DATE = "2021";
    private ArgumentCaptor<String> arg;
    private CoronaAfspraakPlanner target;
    private SystemInWrapper in = mock(SystemInWrapper.class);
    private SoutWrapper out = mock(SoutWrapper.class);

    @BeforeEach
    void setUp() {
        arg = ArgumentCaptor.forClass(String.class);

        target = new CoronaAfspraakPlanner();
        target.setIn(in);
        target.setOut(out);

        when(in.nextLine()).thenReturn(BSN);

        doNothing().when(out).print(arg.capture());
        doNothing().when(out).printLn(arg.capture());
    }

    @Test
    void printFirstLine() {
        target.run();
        verify(out, times(1)).print(anyString());
    }

    @Test
    void askInput() {
        target.run();
        verify(in, times(1)).nextLine();
    }

    @Test
    void printBSN() {
        target.run();
        verify(out, times(1)).printLn(contains(BSN));
        Assert.assertTrue(arg.getAllValues().get(1).contains(BSN));
        Assert.assertFalse(arg.getAllValues().get(1).contains(BSN + 1));
    }

    @Test
    void printDate() {
        target.run();
        Assert.assertTrue(arg.getAllValues().get(2).contains(DATE));
    }

}