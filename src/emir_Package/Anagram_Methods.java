package emir_Package;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram_Methods {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(isAnagram(in.nextLine(), in.nextLine()));
    }

    public static boolean isAnagram(String word1, String word2) {

        String str ="";
        String reversed ="";

        char[] arr1 = word1.toCharArray();
        char[] arr2 = word2.toCharArray();

        for (char each : arr1) {
            str+=each;
        }

        for (char each : arr2) {
            reversed+=each;
        }

        str = str.toLowerCase();
        reversed = reversed.toLowerCase();

        String[] strArr = str.split("");
        String[] strArr2 = reversed.split("");

        Arrays.sort(strArr);
        Arrays.sort(strArr2);

        System.out.println(str);
        System.out.println(reversed);


        return  Arrays.equals(strArr,strArr2);

    }

}
