package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CatGetSoundTests {

    Feline feline;

    @Test
    public void getFoodListTwoValuesSuccess() throws Exception{
        Cat cat = new Cat (feline);
        assertEquals(cat.getSound(), "Мяу");
    }
}
