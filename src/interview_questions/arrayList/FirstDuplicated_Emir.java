package interview_questions.arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstDuplicated_Emir {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,2,3,4,4,5,6,7,7));

        int firstDuplicatedElement = 0;

        for (int i = 0; i < list.size(); i++) {

            int counter = 0;

            for (int j = 0; j < list.size(); j++) {

                if (list.get(i) == list.get(j)){
                    counter++;
                }

            }

            if (counter>1){
                firstDuplicatedElement = list.get(i);
                break;
            }

        }

        System.out.println("firstDuplicatedElement = " + firstDuplicatedElement);
    }

}
/*
7. Write a program that can return the first duplicated element from an arrayList of Integer
        Ex:
            list = [1,2,2,3,4,4,5,6,7,7];
            output:
                2
 */
