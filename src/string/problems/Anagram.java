package string.problems;
import java.util.Arrays;
import java.lang.reflect.Array;

public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
        String st1 = "CAT";
        String st2 = "ACT";
        // If the length of both the strings are equal
        if(st1.length() == st2.length())
        {
            // Convert the st1 and st2 string into lowercase then into array of characters
            char[] st1CharArr = (st1.toLowerCase()).toCharArray();
            char[] st2CharArr = (st2.toLowerCase()).toCharArray();

            // Sort the first array
            Arrays.sort(st1CharArr);

            // Sort the second array
            Arrays.sort(st2CharArr);

            // If both the arrays are equal
            if(Arrays.equals(st1CharArr, st2CharArr))
            {
                System.out.println(st1 + " and " + st2+ " are anagram");
            }

            else
            {
                System.out.println(st1 + " and " + st2+ " are not anagram");
            }
        }
        // If the length of both the strings are not equal
        else
        {
            System.out.println(st1 + " and " + st2 + " are not anagram");
        }

    }






    }

