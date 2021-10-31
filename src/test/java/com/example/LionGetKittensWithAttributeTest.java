package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionGetKittensWithAttributeTest {

    int expected;
    int kittensCount;

    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Mock
    Feline feline;

    Lion lion = new Lion("Самка", feline);

    @Parameterized.Parameters
    public static Object[][] getSexData() {
        return new Object[][]{
                {0, 0},
                {2, 2},
                {-2, -2},
        };
    }

    public LionGetKittensWithAttributeTest(int expected, int kittensCount) throws Exception {
        this.expected = expected;
        this.kittensCount = kittensCount;
    }

    @Test
    public void getKittensWithAttribute() {
        assertEquals(expected, lion.getKittens(kittensCount));
    }
}