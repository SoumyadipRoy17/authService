package org.example.util;

import org.example.model.UserInfoDto;

import java.util.regex.Pattern;

public class ValidateUtil {

    private static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@(.+)$";
    private static final String PASSWORD_REGEX = "^(?=.*[0-9])(?=.*[a-zA-Z])(?=.*[!@#$%^&*]).{8,}$";

    private static final Pattern emailPattern = Pattern.compile(EMAIL_REGEX);
    private static final Pattern passwordPattern = Pattern.compile(PASSWORD_REGEX);

    public static void validateUserAttributes(UserInfoDto user) {
        if (!isValidEmail(user.getUsername())) {
            throw new IllegalArgumentException("Invalid email format");
        }
        if (!isValidPassword(user.getPassword())) {
            throw new IllegalArgumentException("Password must be at least 8 characters long, include a number, a letter, and a special character.");
        }
    }

    public static boolean isValidEmail(String email) {
        return email != null && emailPattern.matcher(email).matches();
    }

    public static boolean isValidPassword(String password) {
        return password != null && passwordPattern.matcher(password).matches();
    }
}