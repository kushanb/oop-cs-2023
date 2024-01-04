package com.oop.cs.testing;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest extends TestCase {

    Calculator calculator;

    @Override
    protected void setUp() throws Exception {
        super.setUp();

        calculator = new Calculator();
    }

    @Test
    public void testAddition() {
//        Calculator calculator = new Calculator();

        assertEquals(6, calculator.addNums(3, 3));
        assertEquals(7, calculator.addNums(3, 4));
        assertEquals(13, calculator.addNums(3, 10));
        assertEquals(5, calculator.addNums(3, 2));
    }

    @Test
    public void testSubtraction() {
//        Calculator calculator = new Calculator();

        assertEquals(6, calculator.subNums(9, 3));
        assertEquals(7, calculator.subNums(11, 4));
        assertEquals(9, calculator.subNums(19, 10));
        assertEquals(10, calculator.subNums(12, 2));
    }

}
