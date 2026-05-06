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
    @Test
    public void testMultiply(){
        int a = 11;
        int b = 12;
        int result = calculator.multiply(a, b);

        assertEquals(a*b, result);
    }
    @Test
    public void testMultiplyByZero(){
        int a = 100;
        int b = 0;
        int result = calculator.multiply(a, b);
        assertEquals(a*b, result);
    }

}
