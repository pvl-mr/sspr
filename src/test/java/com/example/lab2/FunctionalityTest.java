package com.example.lab2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunctionalityTest {

    @Test
    public void test(){
        int x = 2;
        int y = 23;

        assertEquals(25, x+y);


    }
}
