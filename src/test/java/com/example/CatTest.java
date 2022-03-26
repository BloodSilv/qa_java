package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class CatTest {
    private Feline feline = new Feline();
    private Cat cat = new Cat(feline);

    @Test
    public void getSound() {
        assertEquals(cat.getSound(), "Мяу");
    }
    @Test
    public void getFood() throws Exception {
        assertEquals(cat.getFood(), List.of("Животные", "Птицы", "Рыба"));
    }
}
