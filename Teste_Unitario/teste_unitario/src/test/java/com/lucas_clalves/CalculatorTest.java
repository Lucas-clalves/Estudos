package com.lucas_clalves;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    Calculator calc;

    @BeforeEach
    void setup() {
        calc = new Calculator();
    }

    // ____________________________________________________________________________________________
    @Test
    @DisplayName("Deve retornar 0 quando nenhum argumento é passado como parametro.")
    public void shouldReturnZeroWhenNoValueherediven() {
        double result = calc.sum();
        assertEquals(0, result);
    }

    @Test
    @DisplayName("Deve retornar a soma entre os mumeros passados como parametro.")
    public void itShouldReturnTheSumOfTheNumbers() {
        double a = 3;
        double b = 5;

        double result = calc.sum(a, b);

        assertEquals(8, result);
    }
    // ____________________________________________________________________________________________

    @Test
    @DisplayName("Deve lançar exeção caso parametro seja um numaro menor que zero")
    public void throwAnExceptionIfTheParameterIsLessThanZero() {
        double n = -1;

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            calc.squareRoot(n);
        });

        assertEquals("The number cannot be negative!", exception.getMessage());
    }

    @Test
    @DisplayName("Retorna a raiz quadrada do numero passado como parametro")
    public void returnsTheSquareRootOfTheNumberPassedAsAParameter() {
        double result = calc.squareRoot(9);
        assertEquals(3, result);
    }

    // ____________________________________________________________________________________________

    @Test
    @DisplayName("Retorna 'true' se o numero passado for impar")
    public void returnsTrueIfTheNumberPassedIsOdd() {
        assertTrue(calc.isOdd(9));
    }

    @Test
    @DisplayName("Retorna 'true' se o numero passado for impar")
    public void returnsFalseIfTheNumberPassedIsEven() {
        assertFalse(calc.isOdd(2));
    }
}