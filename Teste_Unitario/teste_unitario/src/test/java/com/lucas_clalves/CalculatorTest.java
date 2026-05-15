package com.lucas_clalves;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    Calculator calc;

    @BeforeEach
    void setup() {
        calc = new Calculator();
    }

    @Test
    @DisplayName("Deve retornar 0 quando nenhum argumento é passado como parametro.")
    public void ShouldReturnZeroWhenNoValueherediven() {
        double result = calc.sum();
        assertEquals(0, result);
    }

    @Test
    @DisplayName("Deve retornar a soma entre os mumeros passados como parametro.")
    public void ItShouldReturnTheSumOfTheNumbers(){
        double a = 3;
        double b = 5;

        double result = calc.sum(a,b);

        assertEquals(8, result);
    }
}