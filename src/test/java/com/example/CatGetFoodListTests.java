package com.example;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CatGetFoodListTests {

    Feline feline;
    List <String> foods = List.of("Сухой корм", "Птицы", "Рыба");

    @Mock
    Predator predator;

    @Test
    public void getFoodListTwoValuesSuccess() throws Exception{
        Cat cat = new Cat (feline);
       // Mockito.when(feline.eatMeat()).thenReturn(foods);
        assertEquals(cat.getFood(), foods);
        Mockito.verify(cat, Mockito.times(1)).predator.eatMeat();
    }
}