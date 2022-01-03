package com.company;

public class SolutionsOfQuadEq {
    public static int solutions(int a, int b, int c) {
        int delta = 0;

        delta = b*b - 4 * a * c;

        if(delta > 0) {
            return 2;
        }
        else if ( delta == 0 ) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(solutions(-1,0,1));
    }
}
