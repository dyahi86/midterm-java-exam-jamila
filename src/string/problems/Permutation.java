package string.problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Permutation {

    public static void main(String[] args) {
        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */


        String s = "ABC";

        // Sorting the string
        // using char array
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        s = new String(arr);

        // Function call
        printAllPermutationsFast(s, "");
    }

    // Method to print all the permutations
    static void printAllPermutationsFast(String s, String l)
    {
        if (s.length() < 1)
            System.out.println(l + s);

        // Set of the characters of the  permutation
    HashSet<Character> uset = new HashSet<Character>();

    // Iterating over the string characters
        for (int i = 0; i < s.length(); i++)
    {

        if (uset.contains(s.charAt(i)))
            continue;
        else

            uset.add(s.charAt(i));
        String temp = "";
        if (i < s.length() - 1)
            temp = s.substring(0, i)
                    + s.substring(i + 1);
        else
            temp = s.substring(0, i);
        printAllPermutationsFast(temp, l + s.charAt(i));
    }
}
}

