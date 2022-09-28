package interview_questions.arrayList.emir;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArrayList_Emir {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,2,3,4,4,5,6,7,7));

        ArrayList<Integer> reversedList = new ArrayList<>();

        for (int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }

        System.out.println(reversedList);


    }

}
