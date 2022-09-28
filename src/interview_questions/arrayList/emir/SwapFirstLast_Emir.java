package interview_questions.arrayList.emir;

import java.util.ArrayList;
import java.util.Arrays;

public class SwapFirstLast_Emir {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5));

        System.out.println(list);

        int firstElement = list.get(0);
        int lastElement = list.get(list.size()-1);

        list.set(0,lastElement);
        list.set(list.size()-1,firstElement);

        System.out.println(list);

    }

}
/*
2. write a program that can swap the first and last elements of an integer arraylist
                ex:
                    list = [1,2,3,4,5];
                    output: [5,2,3,4,1];
 */