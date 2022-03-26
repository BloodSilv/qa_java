package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class FelineMockTest {
    @Mock
    Feline feline;

    @Test
    public void eatMeat() throws Exception {
        feline.eatMeat();
        Mockito.verify(feline).eatMeat();
    }

    @Test
    public void getFamily() {
        feline.getFamily();
        Mockito.verify(feline).getFamily();
    }

    @Test
    public void getKittens() {
        feline.getKittens();
        Mockito.verify(feline).getKittens();
    }

    @Test
    public void testGetKittens() {
        feline.getKittens(2);
        Mockito.verify(feline).getKittens(2);
    }

    @Test
    public void getKittensThreeTimes() {
        feline.getKittens(2);
        feline.getKittens(2);
        feline.getKittens(2);
        Mockito.verify(feline, Mockito.times(3)).getKittens(2);
    }
}