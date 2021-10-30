package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionCreateSuccessfulTests {

    String sex;
    boolean expected;

    @Parameterized.Parameters
    public static Object[][] getSexData() {
        return new Object[][] {
                { "Самец", true},
                { "Самка", false},
        };
    }

    public LionCreateSuccessfulTests(String sex, Boolean expected){
        this.expected = expected;
        this.sex = sex;
    }

    @Test
    public void createLionManTest() throws Exception {
        Lion lion = new Lion (sex);
        assertEquals(expected, lion.doesHaveMane());
    }
}