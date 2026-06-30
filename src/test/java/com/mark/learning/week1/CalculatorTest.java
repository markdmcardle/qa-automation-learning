package com.mark.learning.week1;

import com.mark.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void shouldAddTwoNumbers() {
        int result = calculator.add(2, 3);

        assertThat(result).isEqualTo(5);
    }

    @Test
    void shouldSubtractTwoNumbers() {
        int result = calculator.subtract(10, 4);

        assertThat(result).isEqualTo(6);
    }

    @Test
    void shouldMultiplyTwoNumbers() {
        int result = calculator.multiply(3, 4);

        assertThat(result).isEqualTo(12);
    }

    @Test
    void shouldDivideTwoNumbers() {
        double result = calculator.divide(10, 2);

        assertThat(result).isEqualTo(5.0);
    }

    @Test
    void shouldThrowErrorWhenDividingByZero() {
        assertThatThrownBy(() -> calculator.divide(10, 0))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Cannot divide by zero");
    }
    @Test
    void shouldAddNegativeNumbers() {
        int result = calculator.add(-3, -7);

        assertThat(result).isEqualTo(-10);
    }

    @Test
    void shouldSubtractResultingInNegativeNumber() {
        int result = calculator.subtract(4, 10);

        assertThat(result).isEqualTo(-6);
    }

    @Test
    void shouldMultiplyByZero() {
        int result = calculator.multiply(5, 0);

        assertThat(result).isEqualTo(0);
    }

    @Test
    void shouldDivideUnevenNumbers() {
        double result = calculator.divide(10, 4);

        assertThat(result).isEqualTo(2.5);
    }
}