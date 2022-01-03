package com.company;

//Create a function that takes an array of more than three numbers and returns the Least Common Multiple (LCM).

public class LCMOfManyNumbers {

    // Recursive method to return gcd of a and b
    static int gcd(int a, int b)
    {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }

    // method to return LCM of two numbers
    static int lcm(int a, int b)
    {
        return (a / gcd(a, b)) * b;
    }

    public static int lcmOfArray(int[] arr) {
        int lcmOfAllPrev = lcm(arr[0], arr[1]);             // counting lcm of two first numbers
        for(int i = 2; i < arr.length; i++) {
            lcmOfAllPrev = lcm(lcmOfAllPrev, arr[i]);       // overwriting variable with lcm of all previous numbers and next one
        }

        return lcmOfAllPrev;
    }

    public static void main(String[] args) {
        int[] arr = {46, 54, 466, 544};
        System.out.println(lcmOfArray(arr));
    }
}
