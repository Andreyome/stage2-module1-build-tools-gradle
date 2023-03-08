package com.epam.demo;

import java.security.spec.ECField;
import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        try {
            for (String str : args) {
                if (Float.parseFloat(str) <= 0) {
                    return false;
                }
            }
            return true;
            //magic happens here
        }
        catch (Exception e){
            return false;
        }
    }
}