package com.example;

import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;

public class LionTest {

    private Feline feline = new Feline();
    private final Lion lion = new Lion("Самец", feline);

    public LionTest() throws Exception {}

    @Test
    public void eatMeat() throws Exception {
        assertEquals(lion.getFood(), List.of("Животные", "Птицы", "Рыба"));
    }

    @Test
    public void doesHaveName() {
        assertTrue(lion.doesHaveMane());
    }

    @Test
    public void testGetKittens() {
        assertEquals(lion.getKittens(), 1);
    }

    @Test(expected = Exception.class)
    public void lionInvalidValueOfSexExceptionTest() throws Exception {
        Lion lion = new Lion("Вырастет - само решит", this.feline);
        lion.doesHaveMane();
    }
}
