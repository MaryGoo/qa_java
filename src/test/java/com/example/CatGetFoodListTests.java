package com.example;

import org.junit.Test;
import org.mockito.Mock;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class CatGetFoodListTests {

  //  Feline feline;
    List <String> foods = List.of("Сухой корм", "Птицы", "Рыба");

    @Mock
    private Predator predator;
    @Mock
    private Feline feline;

    @Test
    public void getFoodListTwoValuesSuccess() throws Exception{
        when(predator.eatMeat()).thenReturn(foods);
        Cat cat = new Cat (feline);
       // assertEquals(cat.getFood(), foods);
        verify(predator).eatMeat();
    }
}