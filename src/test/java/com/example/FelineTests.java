package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTests {

    @Test
    public void getFamilySuccess(){
        assertEquals(feline.getFamily(),"Кошачьи");
    }

    @Test
    public void getKittensWithoutAttribute(){
        assertEquals(feline.getKittens(),1);
    }

    @Spy
    private Feline feline ;

    @Test
    public void eatMeatPredatorSuccess() throws Exception {
        List expectedList = List.of("Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(expectedList);
        assertEquals(expectedList.size(),feline.eatMeat().size() );
        assertEquals(expectedList, feline.eatMeat());
    }
}