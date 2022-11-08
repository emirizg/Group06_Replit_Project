package emir_Package;

import java.util.Scanner;

public class At3rd {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(at3(in.next(), in.next()));
    }

    public static String at3(String target,String word){


        String result = "";

        result = target.substring(0,3) + word + target.substring(3);

        return result;

    }



}
/*
at3 accepts two strings and returns a string.
The first string is the one that will be manipulated.
At the 3rd char position of target you will insert the word argument.
Example:
at3("longword","foo")
return: "lonfoogword"

at3("blabla","a")
return: "blaabla"
 */