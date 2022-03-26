package com.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalTest {
    private Animal animal = new Animal();

    @Test
    public void getFood() {
        try {
            animal.getFood("Веган");
        } catch (Exception InvalidAnimalKind) {
            assertEquals(InvalidAnimalKind.getMessage(),
                    "Неизвестный вид животного, используйте значение Травоядное или Хищник");
        }
    }

    @Test
    public void getFamily() {
        assertEquals(animal.getFamily(),
                "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи");
    }
}