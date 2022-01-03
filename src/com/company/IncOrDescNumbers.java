package com.company;
import java.lang.Math;

// Tesh needs your help to find out the numbers with increasing or decreasing digits for a given range.

public class IncOrDescNumbers {
    //Function checking if given number has increasing digits
    public static boolean isIncreasing(int n) {
        int firstToRight, secondToRight; // variables to store two most right digits in number, which the we will be comparing
        while (true) {
            if(n < 10) return true;

            firstToRight = n % 10;             // n = 1234 first to right = 4
            n /= 10;                           // n = 123
            secondToRight = n % 10;            // n = 123 second to right = 3

            if (firstToRight < secondToRight) {
                return false;
            }

        }
    }

    //Function checking if given number has decreasing digits
    public static boolean isDecreasing(int n) {
        int firstToRight, secondToRight; // variables to store two most right digits in number, which the we will be comparing
        while (true) {
            if(n < 10) return true;

            firstToRight = n % 10;             // n = 4321 first to right = 1
            n /= 10;                           // n = 432
            secondToRight = n % 10;            // n = 123 second to right = 2

            if (firstToRight > secondToRight) {
                return false;
            }

        }
    }


    public static int incDec(int n) {
        if(n <= 0) return 1;
        if(n == 1) return 10;

        int sum = 0;
        for(int i = 0; i < Math.pow(10, n); i++) {
            if(isIncreasing(i) || isDecreasing(i)) {
                sum++;
            }
        } return sum;
    }
    public static void main(String[] args) {
        System.out.println(incDec(3));
    }
}
