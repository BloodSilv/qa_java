package com.example;

import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;

public class AlexTest {
    private Feline feline = new Feline();
    private Alex alex = new Alex(feline);

    public AlexTest() throws Exception {
    }

    @Test
    public void getFriends() {
        assertEquals(alex.getFriends(), List.of("Марти", "Глория", "Мелман"));
    }

    @Test
    public void getPlaceOfLiving() {
        assertEquals(alex.getPlaceOfLiving(), "Нью-Йоркский зоопарк");
    }

    @Test
    public void getKittens() {
        assertEquals(alex.getKittens(), 0);
    }

    @Test
    public void getOneKittens() {
        assertEquals(alex.getKittens(), 0);
    }
}
