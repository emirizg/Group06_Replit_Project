package interview_questions.arrayList.emir;

import java.util.ArrayList;
import java.util.Arrays;

public class UniqueElements_Emir {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,1,2,2,3,4,4,5,6,7,7));


        for (int i = 0; i<list.size();i++){

            int counter = 0;
            for (int j = 0; j < list.size(); j++) {

                if (list.get(i) == list.get(j)){
                    counter++;
                }

            }

            if (counter == 1){
                System.out.println(list.get(i));
                break;
            }

        }


    }

}
/*
1. Write a program that can return the first unique elements from an arraylist
            Do not use indexOf & lastIndexOf methods
 */