package com.mark.learning.week2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LoginValidatorTest {
    private LoginValidator loginValidator;

    @BeforeEach
    void setUp() {
        loginValidator = new LoginValidator();
    }

    @Test
    void shouldAllowLoginWhenUsernameAndPasswordAreValid() {
        boolean result = loginValidator.canLogin("mark", "Password123");

        assertThat(result).isTrue();
    }

    @Test
    void shouldNotAllowLoginWhenUsernameIsTooShort() {
        boolean result = loginValidator.canLogin("ma", "Password123");

        assertThat(result).isFalse();
    }

    @Test
    void shouldNotAllowLoginWhenPasswordIsTooShort() {
        boolean result = loginValidator.canLogin("mark", "Pass1");

        assertThat(result).isFalse();
    }

    @Test
    void shouldNotAllowLoginWhenUsernameIsNull() {
        boolean result = loginValidator.canLogin(null, "Password123");

        assertThat(result).isFalse();
    }

    @Test
    void shouldNotAllowLoginWhenPasswordIsNull() {
        boolean result = loginValidator.canLogin("mark", null);

        assertThat(result).isFalse();

    }
}
