package com.company;

// Given an integer value, return a new integer according to the rules below:
//
// Split the number into groups of two digit numbers. If the number has an odd number of digits, return -1.
// For each group of two digit numbers, concatenate the last digit to a new string the same number of times as the value of the first digit.
// Return the result as an integer.

// lookAndSay(3132) ➞ 111222

// By reading the number digit by digit, you get three "1" and three "2".
// Therefore, you put three ones and three two's together.
// Remember to return an integer value (i.e BigIntger class).

import java.math.BigInteger;

public class LookAndSayNumbers {

    public static BigInteger lookAndSay(long n) {
        long copyOfN = n, flag = 0;                             // flag to follow if every number has its pair
        while(copyOfN > 0)  {
            copyOfN /= 10;
            flag++;
        }

        if(flag % 2 == 1) return new BigInteger("-1");

        long numberToPrint, amountOfPrints;
        StringBuilder sb = new StringBuilder();

        while(n > 10) {
            numberToPrint = n % 10;
            n /= 10;

            amountOfPrints = n % 10;
            n /= 10;

            for(int i = 0; i < amountOfPrints; i++) {
                sb.append(numberToPrint);
            }
        }



        return new BigInteger(sb.reverse().toString());
    }

    public static void main(String[] args) {
        System.out.println(lookAndSay(3215));
    }

}
