package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        if (str == null || str.trim().length() == 0 || str.equals("null")) return false;
        return Double.parseDouble(str) > 0;
    }
}
