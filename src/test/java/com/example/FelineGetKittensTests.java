package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineGetKittensTests {

    int expected;
    int kittensCount;

    Feline feline = new Feline();

    @Parameterized.Parameters
    public static Object[][] getSexData() {
        return new Object[][] {
                { 0, 0},
                { 2, 2},
                {-2, -2},
        };
    }

    public FelineGetKittensTests(int expected, int kittensCount){
        this.expected = expected;
        this.kittensCount = kittensCount;
    }

    @Test
    public void getKittensWithAttribute(){
        assertEquals(expected,feline.getKittens(kittensCount));
    }
}