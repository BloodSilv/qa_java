package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class AlexMockTest {

    @Mock
    Feline feline;

    @Test
    public void getFriendsForAlex() throws Exception {
        Alex alex = new Alex(this.feline);
        List<String> actual = alex.getFriends();
        List<String> expected = Arrays.asList("Марти", "Глория", "Мелман");
        assertEquals(expected,actual);
    }

    @Test
    public void getPlaceOfLivingForAlex() throws Exception {
        Alex alex = new Alex(this.feline);
        String actual = alex.getPlaceOfLiving();
        String expected = "Нью-Йоркский зоопарк";
        assertEquals(expected,actual);
    }

    @Test
    public void getKittensForAlexZero() throws Exception {
        Alex alex = new Alex(this.feline);
        Mockito.when(feline.getKittens()).thenReturn(0);
        int actual = alex.getKittens();
        int expected = feline.getKittens();
        assertEquals(expected,actual);
    }
}