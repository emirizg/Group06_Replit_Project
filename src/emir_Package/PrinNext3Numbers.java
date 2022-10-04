package emir_Package;

import java.util.Scanner;

public class PrinNext3Numbers {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("enter number");
        int num = inp.nextInt();

        next3(num);

    }

    public static void next3(int num){
        System.out.print(num+1 + " ");
        System.out.print(num+2 + " ");
        System.out.print(num+3);
    }

}
/*
Create a method called next3 .
This method has an int argument and prints the next 3 numbers after that number.
Call the method from main method and pass num to it.

flow:
enter number
1
next 3 are:
2 3 4
(put a space between numbers)
 */