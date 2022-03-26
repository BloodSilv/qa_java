package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CatMockTest {
    @Mock
    Cat cat;

    @Test
    public void getSound() {
        cat.getSound();
        Mockito.verify(cat).getSound();
    }

    @Test
    public void getFood() throws Exception {
        cat.getFood();
        Mockito.verify(cat).getFood();
    }
}