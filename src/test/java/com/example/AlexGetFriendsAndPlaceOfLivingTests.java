package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class AlexGetFriendsAndPlaceOfLivingTests {

    @Mock
    Feline feline;

    @Test
    public void getFriendsTest() throws Exception {
        Alex alex = new Alex("Самец", feline);
        assertEquals(List.of("Марти", "Глория", "Мелман"), alex.getFriends());
    }

    @Test
    public void getPlaceOfLivingTest() throws Exception {
        Alex alex = new Alex("Самец", feline);
        assertEquals("Нью-Йоркский Зоопарк",alex.getPlaceOfLiving());
    }
}