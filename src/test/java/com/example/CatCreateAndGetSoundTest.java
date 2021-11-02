package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CatCreateAndGetSoundTest {

    Feline feline;

    @Test
    public void getFoodListTwoValuesSuccess(){
        Cat cat = new Cat (feline);
        assertEquals(cat.getSound(), "Мяу");
    }

    @Test
    public void createCatTest(){
        Cat cat = new Cat(feline);
        assertEquals(feline,cat.predator);
    }
}