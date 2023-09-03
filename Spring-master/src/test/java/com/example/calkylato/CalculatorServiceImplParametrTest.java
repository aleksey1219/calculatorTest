package com.example.calkylato;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.web.bind.annotation.RequestParam;

import java.lang.reflect.Parameter;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplParametrTest {
    CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();

    private static List<Arguments> parametrs() {
        return List.of(Arguments.of(-1, -23),
                Arguments.of(0, 1),
                Arguments.of(1, -1),
                Arguments.of(-1, 23),
                Arguments.of(1, 2),
                Arguments.of(2, 1));
    }

    @ParameterizedTest
    @MethodSource("parametrs")
    void testSum(double num1, double num2) {
        assertEquals(num1+num2,calculatorService.sum(num1,num2));
        assertEquals(num1-num2,calculatorService.min(num1,num2));
        assertEquals(num1*num2,calculatorService.multiply(num1,num2));
        assertEquals(num1/num2,calculatorService.divide(num1,num2));
    }

    @Test
    void zeroDivided() {
        assertThrows(RuntimeException.class,()->calculatorService.divide(10, 0));
    }
}