package com.example;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.Collections;

public class LionGetFoodExceptionTest {

    @Mock
    Feline feline;

    @Test(expected = Exception.class)
    public void eatMeatEmptyTest() throws Exception{
        new Lion ("Самка", feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(Collections.singletonList(""));
    }
}