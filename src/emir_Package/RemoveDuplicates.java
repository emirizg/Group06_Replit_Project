package emir_Package;

import java.util.Scanner;

public class RemoveDuplicates {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(uniqueChars(in.next()));
    }

    public static String uniqueChars(String str) {
        //TODO: write your code

        String uniqueLetter = "";

        for(int i=0; i<str.length(); i++){

            if(uniqueLetter.contains(str.charAt(i)+"")){
                continue;
            }else if(!(uniqueLetter.contains(str.charAt(i)+""))){
                uniqueLetter+=str.charAt(i);
            }

        }

        return uniqueLetter;
    }
}
