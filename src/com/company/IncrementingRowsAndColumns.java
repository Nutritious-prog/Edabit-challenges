package com.company;

// Write a function that takes in three parameters: r, c, i, where:
//
// * r and c are the number of rows and columns to initialize a zero matrix.
// * i represents the array of incrementing operations (+1).
// And returns the resulting matrix after applying all the increment operations.
// Each increment operation will add 1 to the rows or columns specified in the incrementing array.

public class IncrementingRowsAndColumns {
    public static void printMatrix(int[][] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] increment(int r, int c, String[] i) {
        int matrix[][] = new int[r][c];
        String instructionArr[];

        //printMatrix(matrix);

        for(String instruction : i) {                                                           // checking if certain instruction string contains 'r' or 'c'
            if(instruction.contains("r")) {                                                     // to know if we wanna affect rows or columns.

                instructionArr = instruction.split("r");                                  // after making decision we need to extract the number or row or column
                for(String rowNumber : instructionArr) {                                             // to increment
                    for(int j = 0; j < matrix[0].length; j++) {
                        if(Integer.valueOf(rowNumber) > matrix.length) break;
                        matrix[Integer.valueOf(rowNumber)][j]++;
                    }
                    printMatrix(matrix);
                    System.out.println();
                }

            } else {
                instructionArr = instruction.split("c");
                for(String columnNumber : instructionArr){
                    for(int j = 0; j < matrix.length; j++) {
                        if(Integer.valueOf(columnNumber) > matrix.length) break;
                        matrix[j][Integer.valueOf(columnNumber)]++;
                    }
                    printMatrix(matrix);
                    System.out.println();
                }
            }
        }

        printMatrix(matrix);

        return matrix;
    }

    public static void main(String[] args) {
        String test[] = {"1r", "2r", "3r", "0c"};
        increment(10,1,test);
    }
}
