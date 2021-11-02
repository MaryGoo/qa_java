package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CatGetFoodExceptionTest {
    @Spy
    Feline feline;

    @Test(expected = Exception.class)
    public void CatGetFoodExceptionTests() throws Exception {
        List expectedList = List.of(null);
        when(feline.eatMeat()).thenReturn(expectedList);
        Cat cat = new Cat(feline);
        assertEquals(expectedList, cat.getFood());
    }
}