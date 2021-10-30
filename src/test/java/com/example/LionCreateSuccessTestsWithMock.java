package com.example;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LionCreateSuccessTestsWithMock {

    @Mock
    Feline feline;

    @Test(expected = Exception.class)
    public void returnKittensLion() throws Exception {
        Lion lion = new Lion("Самец",feline);
        when(feline.getKittens()).thenReturn(1);
        int expected =1;
        assertEquals(expected,lion.getKittens());
    }
}