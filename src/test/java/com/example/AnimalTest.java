package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AnimalTest {
    private Animal animal = new Animal();

    @Test(expected = Exception.class)
    public void getFood() throws Exception{
        Animal animal = new Animal();
        animal.getFood("Веган");
    }

    @Test
    public void getFamily() {
        assertEquals(animal.getFamily(),
                "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи");
    }
}