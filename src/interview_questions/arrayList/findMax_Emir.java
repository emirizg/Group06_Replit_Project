package interview_questions.arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class findMax_Emir {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        int max = arr.get(0);

        for (Integer eachNum : arr) {
            if (eachNum>max){
                max=eachNum;
            }
        }
        System.out.println("max = " + max);

    }

}
/*
5. Write a program that can find the maximum number from an ArrayList of integers
        Ex:
            list = [1,2,3,4,5];
            output:
                5
 */