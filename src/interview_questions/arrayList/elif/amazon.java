package interview_questions.arrayList.elif;

import java.util.Arrays;

public class amazon {

    //given an array of integers , print first 5 largest numbers
    public static void main(String[] args) {

        int[] arr = {1,6,3,8,4,9,34,23,1,5};

        int result = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j] ){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }

        System.out.println(arr[arr.length-5]);
    }


}
