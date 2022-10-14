package com.udaya.inteview.question.util;

import java.util.TreeMap;

public class RoamingNumber {
    private final static TreeMap<Integer, String> roamsMap = new TreeMap<>();

    static {
        roamsMap.put(1000, "M");
        roamsMap.put(900, "CM");
        roamsMap.put(500, "D");
        roamsMap.put(400, "CD");
        roamsMap.put(100, "C");
        roamsMap.put(90, "XC");
        roamsMap.put(50, "L");
        roamsMap.put(40, "XL");
        roamsMap.put(10, "X");
        roamsMap.put(9, "IX");
        roamsMap.put(5, "V");
        roamsMap.put(4, "IV");
        roamsMap.put(1, "I");
    }

    public String toRoman(int number) {
        int result = roamsMap.floorKey(number);
        if (number == result) {
            return roamsMap.get(number);
        } else {
            return roamsMap.get(result) + toRoman(number - result);
        }
    }
}
