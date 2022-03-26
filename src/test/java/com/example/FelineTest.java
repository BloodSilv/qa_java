package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FelineTest {
    private Feline feline = new Feline();

    @Test
    public void eatMeat() throws Exception {
        assertEquals(feline.eatMeat(), List.of("Животные", "Птицы", "Рыба"));
    }

    @Test
    public void getFamily() {
        assertEquals(feline.getFamily(), "Кошачьи");
    }
}
