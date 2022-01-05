package com.company;

import java.util.Arrays;

// Create a function that determines whether elements in an array can be re-arranged to
// form a consecutive list of numbers where each number appears exactly once.

public class ConsecutiveNumbers {
    public static boolean cons(int[] arr) {
        Arrays.sort(arr);


        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i] + 1 != arr[i + 1]) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        int[] arr = {7, 9, 8, 10, 12, 11};
        System.out.println(cons(arr));
    }
}
