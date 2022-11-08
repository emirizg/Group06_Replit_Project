package emir_Package;

import java.util.Scanner;

public class Plus_Minus {


    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();
        int[] arr = new int[size];
        for(int i=0 ;i<=size-1;i++) {
            arr[i]=inp.nextInt();
        }

        plus_minus(arr);
    }

    public static void plus_minus(int[] arr){

        int pos=0;
        int neg=0;
        int zer=0;

        for (int eachNum : arr) {
            if (eachNum>0){
                pos++;
            } else if (eachNum < 0) {
                neg++;
            } else if (eachNum == 0) {
                zer++;
            }
        }

        System.out.println("positives:"+pos+", negatives:"+neg+", zeros:"+zer);

    }


}

/*
Create a method called plus_minus that gets an array of ints (int[]), it outputs how many negative ,
positive and zero numbers are in the array.

Example:
plus_minus (new int[]{1,2,55,-9,-2,0});
output:
positives:3, negatives:2, zeros:1
 */
