package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import java.util.List;
import static org.junit.Assert.*;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
   private Feline feline;

    @Test
    public void getFoodTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actual = lion.getFood();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expected, actual);
    }

    @Test
    public void getKittensCountTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        int actual = lion.getKittens();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test(expected = Exception.class)
    public void lionInvalidValueOfSexExceptionTest() throws Exception {
        Lion lion = new Lion("Вырастет - само решит", this.feline);
        lion.doesHaveMane();
    }
}
