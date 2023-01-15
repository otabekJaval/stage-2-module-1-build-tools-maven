package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        if (str == null || str.trim().length() == 0) return false;
        return Double.parseDouble(str) > 0;
    }
}
