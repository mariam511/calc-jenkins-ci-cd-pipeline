package com.calculator;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    public void testAdd(){
        int a = 10;
        int b = 10;
        int result = calculator.add(a, b);

        assertEquals(a+b, result);
    }
    @Test
    public void testSubtract(){
        int a = 10;
        int b = 10;
        int result = calculator.subtract(a, b);

        assertEquals(a-b, result);
    }
}
