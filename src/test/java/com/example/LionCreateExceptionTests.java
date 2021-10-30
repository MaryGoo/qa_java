package com.example;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class LionCreateExceptionTests {

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test(expected = Exception.class)
    public void createLionManTest() throws Exception {
        Lion lion = new Lion ("hfadhf");
        exception.expectMessage("Используйте допустимые значения пола животного - самей или самка");
    }
}