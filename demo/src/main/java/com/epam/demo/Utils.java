package com.epam.demo;

import org.apache.commons.lang3.math.NumberUtils;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        try {
            for (String str : args) {
                if(!NumberUtils.isCreatable(str)){
                    return false;
                }
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