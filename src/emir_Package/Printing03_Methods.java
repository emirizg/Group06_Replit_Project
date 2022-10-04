package emir_Package;

import java.util.Scanner;

public class Printing03_Methods {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[6];
        for (int i=0;i<6;i++)
        {
            arr[i] = input.nextLine();
        }
        // DO NOT TOUCH ABOVE

        printing(arr);

    }

    public static void printing(String[] strArr){



        for (int i = 0; i < strArr.length-2; i++) {


            System.out.print(strArr[i] + ", ");
            System.out.print(strArr[i+1] + ", ");
            System.out.println(strArr[i+2]);



        }


    }

}
/*
The code provided in your main method will take in six Strings and save them into an array arr.

Print out the 3 neighboring items of the array in one line until the last line each line should contain
3 neighboring items of array element as displayed below

Example:

arr -> ["apple", "banana", "kiwi", "grape", "milk", "soda"]

Output:
apple, banana, kiwi
banana, kiwi, grape
kiwi, grape, milk
grape, milk, soda
 */