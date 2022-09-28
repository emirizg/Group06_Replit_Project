package interview_questions;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
       int[] array = {1,2,3,4,5};
       int[] reversedArray = new int[5];

       int n=0;

        for (int i = array.length - 1; i >= 0; i--) {
            reversedArray[n++] = array[i];
        }

        System.out.println(Arrays.toString(reversedArray));
    }
}
/*

5.  Write a program that can reverse an array of integers and
returns it as new array
ex:
array = {1,2,3,4,5};
output:
reversedArray = {5,4,3,2,1};
 */