package com.company;

// Create a function that takes an array of numbers and return "Boom!" if the digit 7 appears in the array.
// Otherwise, return "there is no 7 in the array".

public class SevenBoom {
    public static boolean containsSeven(int number) {
        int check = 0;                                                  // var for storing result of % on number
        while(number > 0) {
            check = number % 10;
            if(check == 7) return true;
            number /= 10;
        } return false;
    }

    public static String sevenBoom(int[] arr) {
        for(int n : arr)  {
            if(containsSeven(n)) return "Boom!";
        };
        return "there is no 7 in the array";
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 87};
        System.out.println(sevenBoom(arr));
    }
}
