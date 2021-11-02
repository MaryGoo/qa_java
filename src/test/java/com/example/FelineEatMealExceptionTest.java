package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class FelineEatMealExceptionTest {

    @Spy
    private Feline feline ;

    @Test(expected = Exception.class)
    public void eatMeatPredatorSuccess() throws Exception {
        List expectedList = List.of(null);
        Mockito.when(feline.getFood("Хищник")).thenReturn(expectedList);
    }
}