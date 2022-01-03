package com.company;

// It's time to send and receive secret messages.
//
// Create two functions that take a string and an array and returns a coded or decoded message.
//
// The first letter of the string, or the first element of the array represents the Character Code of that letter.
// The next elements are the differences between the characters: e.g. A +3 --> C or z -1 --> y.

// encrypt("Hello") ➞ [72, 29, 7, 0, 3]
// H = 72, the difference between the H and e is 29 (upper- and lowercase).
// The difference between the two l's is obviously 0.
//
// decrypt([ 72, 33, -73, 84, -12, -3, 13, -13, -68 ]) ➞ "Hi there!"
//
// encrypt("Sunshine") ➞ [83, 34, -7, 5, -11, 1, 5, -9]

public class DifferenceCipher {
    public static int[] encrypt(String str) {
        char[] myString = new char[str.length()];                       // char array for my string
        int[] encryptedString = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            myString[i] = str.charAt(i);                                // converting string into char arr
        }

        encryptedString[0] = myString[0];

        for(int j = 1; j < str.length(); j++) {
            encryptedString[j] = myString[j] - myString[j-1];    // assigning differences between two letters in string to array of codes
        }

        return encryptedString;
    }

    public static String decrypt(int[] arr) {
        char[] myString = new char[arr.length];
        int letterCode = 0;

        myString[0] = (char)arr[0];

        letterCode += arr[0];

        for (int i = 1; i < arr.length; i++) {
            letterCode += arr[i];                               // summing the consecutive differences between characters to receive wanted characters
            myString[i] = (char)(letterCode);                   // 72 = H | 72 + 33 = i | 72 + 33 + (-73) = ' ' | 72 + 33 + (-73) + 84 = t ...
        }

        String str = String.valueOf(myString);

        return str;
    }

    public static void main(String[] args) {
        int[] arr = {72, 33, -73, 84, -12, -3, 13, -13, -68};
        System.out.println(decrypt( arr));
    }
}
