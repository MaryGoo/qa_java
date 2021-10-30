package com.example;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.Collections;

public class CatGetFoodExceptionTests {

    Feline feline;

   @Mock
   Predator predator;

    @Test(expected = Exception.class)
    public void eatMeatEmptyTest() throws Exception{
        new Cat (feline);
        Mockito.when(predator.eatMeat()).thenReturn(Collections.singletonList(""));
    }
}