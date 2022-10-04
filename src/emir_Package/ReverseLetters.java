package emir_Package;

import java.util.Scanner;

public class ReverseLetters {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println(reverseNoSpec(in.next()));

    }

    public static String reverseNoSpec(String str) {

        // your code here

        String reversed = "";

        for (int i = str.length()-1; i >= 0; i--) {

            reversed+=str.charAt(i);

        }

        char[] strCharArray = str.toCharArray();
        char[] reversedCharArray = reversed.toCharArray();

        for (int i = 0; i < strCharArray.length; i++) {

            for (int j = 0; j < reversedCharArray.length; j++) {



            }

        }

        return reversed;

    }

}
/*
Create a method reverseNoSpec(String) that will reverse a string without affecting special characters

Given a string, that contains special character together with alphabets (‘a’ to ‘z’ and ‘A’ to ‘Z’),
reverse the string in a way that special characters are not affected.
Input:   str = "a,b$c"
Output:  str = "c,b$a"
Note that $ and , are not moved anywhere.
Only subsequence "abc" is reversed.
Input:   str = "Ab,c,de!$"
Output:  str = "ed,c,bA!$"
Input:   str = "----qwe--r--tyf...gd.---"
Output:  str = "----dgf--y--tre...wq.---"


if (Character.isLetter(strCharArray[i]) && Character.isLetter(reversedCharArray[j])){

                }
 */