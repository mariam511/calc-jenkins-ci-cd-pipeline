package com.calculator;

import org.junit.jupiter.api.Test;

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
    @Test
    public void testDivideHappySenario(){
        int a = 100;
        int b = 10;
        int result = calculator.divide(a, b);

        assertEquals(a/b, result);
    }
    @Test
    public void testDivideByZero(){
        int a = 100;
        int b = 0;
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(a, b);
        });
    }

    @Test
    public void testModulus() {
        int a = 10;
        int b = 3;
        int result = calculator.modulus(a, b);
        assertEquals(a % b, result);
    }

    @Test
    public void testModulusByZero() {
        int a = 100;
        int b = 0;
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.modulus(a, b);
        });
    }

    @Test
    public void testPower() {
        int a = 2;
        int b = 3;
        int result = calculator.power(a, b);
        assertEquals((int) Math.pow(a, b), result);
    }

    @Test
    public void testSquare() {
        int a = 5;
        int result = calculator.square(a);
        assertEquals(a * a, result);
    }

    @Test
    public void testSquareRoot() {
        int a = 25;
        int result = calculator.squareRoot(a);
        assertEquals((int) Math.sqrt(a), result);
    }

    @Test
    public void testSquareRootNegative() {
        int a = -25;
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.squareRoot(a);
        });
    }

    @Test
    public void testFactorial() {
        int a = 5;
        int result = calculator.factorial(a);
        assertEquals(120, result);
    }

    @Test
    public void testFactorialNegative() {
        int a = -5;
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.factorial(a);
        });
    }

}
