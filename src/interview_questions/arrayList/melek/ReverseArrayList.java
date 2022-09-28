package interview_questions.arrayList.melek;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArrayList {

    public static void main(String[] args) {


        ArrayList<Integer> list= new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));

        ArrayList<Integer>reversed=new ArrayList<>();

        for (int i = list.size() - 1; i >= 0; i--) {
            reversed.add(list.get(i));
        }

        System.out.println(reversed);






    }


    
}
