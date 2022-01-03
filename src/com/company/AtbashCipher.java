package com.company;

//The Atbash cipher is an encryption method in which each letter of a word is replaced with its "mirror" letter in the alphabet: A <=> Z; B <=> Y; C <=> X; etc.
//
//Create a function that takes a string and applies the Atbash cipher to it.


public class AtbashCipher {
    public static int asciiConverter(int asciiCode, int startingAscii) {                   // function converts ascii code to its mirror letter code
        int distanceFromA = asciiCode - startingAscii;

        return startingAscii + 25 - distanceFromA;
    }

    public static String atbash(String str) {
        char[] myString = new char[str.length()];                       // char array for my string

        for (int i = 0; i < str.length(); i++) {
            myString[i] = str.charAt(i);                                // converting string into char arr
        }

        for(int j = 0; j < str.length(); j++) {
            if(myString[j] > 64 && myString[j] < 91) {
                System.out.println(myString[j]);
                myString[j] = (char)asciiConverter(myString[j], 65);
                System.out.println(myString[j]);
            }
            if(myString[j] > 96 && myString[j] < 123) {
                System.out.println(myString[j]);
                myString[j] = (char)asciiConverter(myString[j], 97);
                System.out.println(myString[j]);
            }
        }

        String returnString = String.valueOf(myString);


        return returnString;
    }

    public static void main(String[] args) {
        atbash("abc");
        System.out.println(atbash("Hello world"));
    }
}
