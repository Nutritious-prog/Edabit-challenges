package com.company;

// Create a function that takes one, two or more numbers as arguments and adds them together to get a new number.
// The function then repeatedly multiplies the digits of the new number by each other, yielding a new number, until the product is only 1 digit long.
// Return the final product.

public class ProductsOfDigitsOfSum {

    public static long productOfDigits(long n) {
        long product = 1;
        for(int i = 0; n > 0; i++) {
            product *= n % 10;
            n /= 10;
        }
        return product;
    }

    public static long sumDigProd(int... values) {

        int sum = 0;
        long product = 0;
        for (int value : values) {
            sum += value;
        }

        if (sum == 0) return 0;

        product = productOfDigits(sum);

        while (true) {
            if (product < 10) return product;
            product = productOfDigits(product);
        }
    }

    public static void main(String[] args) {
        System.out.println(sumDigProd(0));
    }
}
