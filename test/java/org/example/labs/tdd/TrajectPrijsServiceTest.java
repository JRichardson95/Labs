package org.example.labs.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;


import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;
import static org.assertj.core.api.Assertions.assertThat;


@ExtendWith(MockitoExtension.class)
class TrajectPrijsServiceTest {

    @InjectMocks
    private TrajectPrijsService target;

    @Mock
    private TrajectNaarTrajectEenhedenService esMock;
    @Mock
    private TrajectEenhedenNaarPrijsService psMock;


    @BeforeEach
    void setUp() {
//        MockitoAnnotations.initMocks(this);
        when(esMock.getTrajectEenheden(eq("Ut"), eq("Am"))).thenReturn(10);
        when(psMock.getPriceTrajectEenheden(anyInt())).thenReturn(3);

    }

    @Test
    void getTrajectPrijsTest(){



        int trajectPrijs = target.getTrajectPrijs("Ut", "Am");



        assertThat(trajectPrijs).isEqualTo(30);

    }
}