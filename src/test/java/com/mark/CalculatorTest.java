package com.mark;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CalculatorTest {

    @Test
    void shouldAddTwoNumbers() {
        Calculator calculator = new Calculator();

        int result = calculator.add(2, 3);

        assertThat(result).isEqualTo(5);
    }

    @Test
    void shouldSubtractTwoNumbers() {
        Calculator calculator = new Calculator();

        int result = calculator.subtract(10, 4);

        assertThat(result).isEqualTo(6);
    }

    @Test
    void shouldMultiplyTwoNumbers() {
        Calculator calculator = new Calculator();

        int result = calculator.multiply(3, 4);

        assertThat(result).isEqualTo(12);
    }

    @Test
    void shouldDivideTwoNumbers() {
        Calculator calculator = new Calculator();

        double result = calculator.divide(10, 2);

        assertThat(result).isEqualTo(5.0);
    }

    @Test
    void shouldThrowErrorWhenDividingByZero() {
        Calculator calculator = new Calculator();

        assertThatThrownBy(() -> calculator.divide(10, 0))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Cannot divide by zero");
    }
}