package emir_Package;

import java.util.Arrays;
import java.util.Scanner;

public class PopulateArray {

    public static int[] populate(int[] r) {

        int[] newArray = new int[r.length];

        for(int j = 0, z = 1; j < r.length; j++, z++){

            newArray[j] = z;

        }

        return newArray;

    }

    public static void main(String[] args) 	{
        int [] i= new int[new Scanner(System.in).nextInt()];
        i = populate(i) ;
        System.out.println(Arrays.toString(i));


    }

}
