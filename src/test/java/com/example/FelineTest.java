package com.example;

import org.junit.Assert;
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

    @Test
    public void getKittens() {
        Feline feline = new Feline();
        int actualKittensCount = feline.getKittens ();
        Assert.assertEquals(1, actualKittensCount);
    }
}
