package deniz_Package;

import java.util.Scanner;

public class ReverseLetter {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println(reverseNoSpec(in.next()));

    }

    public static String reverseNoSpec(String str) {

        // your code here
        String result = "";

        String [] arr = str.split("");



        for (int i = arr.length - 1; i >= 0; i--) {
            int n = 0;
            char ch = str.charAt(i);
            if (!(((ch >= 'a') && (ch <= 'z')) || ((ch >= 'A') && (ch <= 'Z')))) {
                result += arr[n];
            } else {
                result += arr[i];

            }
            n++;
        }
        return result;
    }
}

