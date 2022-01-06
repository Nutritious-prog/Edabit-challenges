package com.company;

// Write a recursive function that takes a string input and returns the string in a reversed case and order.

public class CaseAndIndexInverter {
    public static String invert(String str) {
        if (str.isEmpty())
            return str;
        //Calling Function Recursively
        return invert(str.substring(1)) + (Character.isUpperCase(str.charAt(0)) ? Character.toLowerCase(str.charAt(0)) : Character.toUpperCase(str.charAt(0)));

    }

    public static void main(String[] args) {
        System.out.println(invert("dLROW YM sI HsEt"));
    }
}
