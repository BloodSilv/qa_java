package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LionMockTest {
    @Mock
    Lion lion;

    @Test
    public void getFood() throws Exception {
        lion.getFood();
        Mockito.verify(lion).getFood();
    }

    @Test
    public void testGetKittens() {
        lion.getKittens();
        Mockito.verify(lion).getKittens();
    }

    @Test
    public void doesHaveMane() {
        lion.doesHaveMane();
        Mockito.verify(lion, Mockito.only()).doesHaveMane();
    }
}