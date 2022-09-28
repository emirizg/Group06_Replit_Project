package interview_questions;

import java.util.Arrays;

public class ReverseArray_melek {


    public static void main(String[] args){

        int[] arr = {1,2,3,4,5};

        int[] reversed=new int[arr.length];

        int n=0;

        for(int i=arr.length-1; i>=0;i--){
            reversed[n++]=arr[i];

        }

        System.out.println(Arrays.toString(reversed));

    }
}






//5.  Write a program that can reverse an array of integers and
//returns it as new array
//ex:
//array = {1,2,3,4,5};
//output:
//reversedArray = {5,4,3,2,1};
