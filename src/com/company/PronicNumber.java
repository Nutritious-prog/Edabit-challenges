package com.company;

// A pronic number (or otherwise called as heteromecic) is a number which is a product of two consecutive integers,
// that is, a number of the form n(n + 1). Create a function that determines whether a number is pronic or not.

public class PronicNumber {
    public static boolean isHeteromecic(int n) {
        for (int i = 0; i * (i + 1) <= n; i++) {
            if(i * (i + 1) == n) return true;
        } return false;
    }

    public static void main(String[] args) {
        System.out.println(isHeteromecic(8));
    }
}
