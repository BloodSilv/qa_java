package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class AlexMockTest {
    @Mock
    Alex alex;

    @Test
    public void getFriends() {
        alex.getFriends();
        Mockito.verify(alex).getFriends();
    }

    @Test
    public void getPlaceOfLiving() {
        alex.getPlaceOfLiving();
        Mockito.verify(alex, Mockito.only()).getPlaceOfLiving();
    }

    @Test
    public void getKittens() {
        alex.getKittens();
        alex.getKittens();
        alex.getKittens();
        Mockito.verify(alex, Mockito.times(3)).getKittens();
    }
}