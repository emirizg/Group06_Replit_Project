package emir_Package;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] nums = new int[in.nextInt()];
        int [] nums2 = new int[in.nextInt()];
        for(int i=0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        for(int i=0; i < nums2.length; i++) {
            nums2[i] = in.nextInt();
        }

        int[] arr = mergR(nums,nums2);


        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length-1){
                System.out.print(arr[i]);
            }else {
                System.out.print(arr[i]+",");
            }
        }
        System.out.print("]");
    }

    public static int[] mergR(int[] a,int[] b) {

        int[] result = new int[a.length + b.length];

        int counter = 0;

        for (int each : a) {
            result[counter++] = each;
        }

        for (int each : b) {
            result[counter++] = each;
        }

        return result;

    }//end mergR




}
/*
mergR merges two arrays into one. It gets two int arrays and returns an int array

Example:

mergR([1,2,3],[4,5,6])

returns [1,2,3,4,5,6]
mergR([1,2],[6,8])

returns [1,2,6,8]
hint:

create a length int for the combined length of both arrays.
create an array with that length (thats the array we will return).
create an iterator for both arrays (int z=0).
loop first array and inside the loop insert current element to the return array (ret[z]=a[i];)
then increment the iterator for both arrays (z++).
do the same for the second array.
 */