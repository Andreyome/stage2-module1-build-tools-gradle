package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        return Float.parseFloat(str) > 0;
         //here magic will happen
    }
}
