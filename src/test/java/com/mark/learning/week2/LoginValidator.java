package com.mark.learning.week2;

public class LoginValidator {
    public boolean isUsernameValid(String username) {
        return username != null && username.length() >= 3;
    }

    public boolean isPasswordValid(String password) {
        return password != null && password.length() >= 8;
    }

    public boolean canLogin(String username, String password) {
        return isUsernameValid(username) && isPasswordValid(password);

    }
}
