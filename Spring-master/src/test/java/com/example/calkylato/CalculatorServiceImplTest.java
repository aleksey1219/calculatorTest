package com.example.calkylato;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplTest {
    CalculatorServiceImpl calculatorService= new CalculatorServiceImpl();

    @Test
    void sumTest() {
        assertEquals(24,calculatorService.sum(20,4));
        assertEquals(4,calculatorService.sum(0,4));
        assertEquals(3,calculatorService.sum(-1,4));
        assertEquals(16,calculatorService.sum(20,-4));
        assertEquals(-24,calculatorService.sum(-20,-4));
    }

    @Test
    void min() {
        assertEquals(16,calculatorService.min(20,4));
        assertEquals(-4,calculatorService.min(0,4));
        assertEquals(-5,calculatorService.min(-1,4));
        assertEquals(24,calculatorService.min(20,-4));
        assertEquals(-16,calculatorService.min(-20,-4));
    }

    @Test
    void multiply() {
        assertEquals(80,calculatorService.multiply(20,4));
        assertEquals(0,calculatorService.multiply(0,4));
        assertEquals(-4,calculatorService.multiply(-1,4));
        assertEquals(-80,calculatorService.multiply(20,-4));
        assertEquals(80,calculatorService.multiply(-20,-4));
    }

    @Test
    void divide() {
        assertEquals(1,calculatorService.divide(1,1));
        assertEquals(0,calculatorService.divide(0,4));
        assertEquals(-2,calculatorService.divide(-4,2));
        assertEquals(0.5,calculatorService.divide(1,2));
        assertEquals(4,calculatorService.divide(-20,-5));
      assertThrows(RuntimeException.class, () -> calculatorService.divide(10, 0));
    }
}