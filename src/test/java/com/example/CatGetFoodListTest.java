package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class CatGetFoodListTest {

    @Spy
    Feline feline;

    @Test
    public void getFoodListTwoValuesSuccess() throws Exception {
        List expectedList = List.of("Птицы", "Рыба");
        when(feline.eatMeat()).thenReturn(expectedList);
        Cat cat = new Cat(feline);
        assertEquals(expectedList.size(), cat.getFood().size()); //если размер списков разный, сраынивать их значения не надо
        assertEquals(expectedList, cat.getFood());
    }
}