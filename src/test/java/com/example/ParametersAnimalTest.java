package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.List;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class ParametersAnimalTest {

    private final String typeFood;
    private final List<String> typeFoodExpected;

    public ParametersAnimalTest(String typeFood, List<String> typeFoodExpected) {
        this.typeFood = typeFood;
        this.typeFoodExpected = typeFoodExpected;
    }

    @Parameterized.Parameters
    public static Object[] getString() {
        return new Object[][] {
                { "Травоядное",List.of("Трава", "Различные растения")},
                { "Хищник", List.of("Животные", "Птицы", "Рыба")},
        };
    }

    @Test
    public void getFood() throws Exception {
        Animal animal = new Animal();
        List<String> actualTypeFood = animal.getFood(typeFood);
        assertEquals(typeFoodExpected, actualTypeFood);
    }
}
