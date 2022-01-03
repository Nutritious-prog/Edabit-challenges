package com.company;

// The additive persistence of an integer, n, is the number of times you have to replace n with the sum of its digits until n becomes a single digit integer.
//
// The multiplicative persistence of an integer, n, is the number of times you have to replace n with the product of its digits until n becomes a single digit integer.
//
// Create two functions that take an integer as an argument and:
//
// Return its additive persistence.
// Return its multiplicative persistence.

public class Persistence {
    public static int sumOfDigits(int n) {
        int sum = 0;
        for(int i = 0; n > 0; i++) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static int additivePersistence(int n) {
        if(n < 10) return 0;
        if(sumOfDigits(n) < 10) return 1;
        return 1 + additivePersistence(sumOfDigits(n));
    }

    public static int productOfDigits(int n) {
        int product = 1;
        for(int i = 0; n > 0; i++) {
            product *= n % 10;
            n /= 10;
        }
        return product;
    }

    public static long multiplicativePersistence(int n) {
        if(n < 10) return 0;
        if(productOfDigits(n) < 10) return 1;
        return 1 + multiplicativePersistence(productOfDigits(n));
    }

    public static void main(String[] args) {
        System.out.println(additivePersistence(5));
        System.out.println(multiplicativePersistence(77));
    }
}
