package emir_Package;

import java.util.Arrays;
import java.util.Scanner;

public class SwitchElements_methods {

    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        int [] arr = {in.nextInt(),in.nextInt(),in.nextInt(),in.nextInt()};

        arr = do_switch(arr);

        System.out.println("["+arr[0]+","+arr[1]+","+arr[2]+","+arr[3]+"]");

    }


    public static int[] do_switch(int[] i) {

        int[] switchedArray = new int[i.length];

        int first = i[0];

        int last = i[i.length-1];

        switchedArray[0] = last;

        for (int j = 1; j < i.length-1; j++) {

            switchedArray[j] = i[j];

        }

        switchedArray[i.length-1]=first;


        return switchedArray;

    }

}
/*
Implement the do_switch method Switch the last element in an array with the first and return the array.

Examples:

do_switch([1,2,3,4])

returns:[4,2,3,1]
do_switch([7,2,3,5])

returns:[5,2,3,7]
 */