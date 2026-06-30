package com.mark.learning.week2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

/*
 * Arrange = prepare data, open page, create request, set preconditions
 * Act     = perform the action
 * Assert  = verify the expected result
 */

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
        int result = calculator.multiply(4, 5);

        assertThat(result).isEqualTo(20);
    }

    @Test
    void shouldDivideTwoNumbers() {
        int result = calculator.divide(20, 4);

        assertThat(result).isEqualTo(5);
    }

    @Test
    void shouldThrowErrorWhenDividingByZero() {
        assertThatThrownBy(() -> calculator.divide(10, 0))
                .isInstanceOf(ArithmeticException.class);
    }
}