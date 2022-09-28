package interview_questions;

import java.util.Arrays;

public class MoveAllZero_Sort {


    public static void main(String[] args){

        int[] arr={10, 0, 5, 0, 1, 0};

        Arrays.sort(arr);

        int[] reverse=new int[arr.length];

        int n=0;
        for(int i=arr.length-1;i>=0; i--){

            reverse[i]=arr[n++];


        }

        System.out.println(Arrays.toString(reverse));



    }

}

/*
6. write a program that can move all the zeros to the end of the array
        Ex:
            array = {10, 0, 5, 0, 1, 0};
            output:
                 {10, 5, 1, 0, 0, 0}
 */


