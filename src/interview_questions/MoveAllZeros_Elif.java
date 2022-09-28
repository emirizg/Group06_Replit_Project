package interview_questions;

import java.util.Arrays;
import java.util.Scanner;

public class MoveAllZeros_Elif {

    public static void main(String[] args) {

        int[] arr = {10, 0, 5, 0, 1, 0};

        int[] result = new int[arr.length];

        int j = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0){
                result[j++] = arr[i];
            }

        }

        System.out.println(Arrays.toString(result));

    }

}
/*
6. write a program that can move all the zeros to the end of the array
        Ex:
            array = {10, 0, 5, 0, 1, 0};
            output:
                 {10, 5, 1, 0, 0, 0}
 */
