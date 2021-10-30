package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTests {
  //  Feline feline = new Feline();

    @Test
    public void getFamilyTest(){
        Feline feline = new Feline();
        assertEquals(feline.getFamily(),"Кошачьи");
    }

    @Mock
    private Feline feline;
    @Mock
    private Animal animal;

    @Test
    public void eatMeatPredatorSuccess() throws Exception {
        //Animal animal = new Animal();
        Mockito.when(animal.getFood("Хищник")).thenReturn(List.of("Животные")); //, "Птицы", "Рыба"));
        assertEquals(feline.eatMeat(),List.of("Животные", "Птицы", "Рыба"));


//            Feline feline = new Feline();
//            Mockito.when(animal.getFood("Хищник")).thenReturn(Arrays.asList("Жывотные", "Птицы", "Рыба"));
//            List<String> actual = feline.eatMeat();
//            List<String> expected = Arrays.asList("Животные", "Птицы", "Рыба");
//            assertEquals(expected, actual);
        }

}

