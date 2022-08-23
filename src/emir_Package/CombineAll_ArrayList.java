package emir_Package;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CombineAll_ArrayList {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int size2 = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(in.nextInt());
        }
        for (int i = 0; i < size2; i++) {
            list2.add(in.nextInt());
        }

        System.out.println(combineAL(list, list2));

    }

    public static ArrayList<Integer> combineAL(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {

        ArrayList<Integer> arr3 = new ArrayList<>();

        arr3.addAll(arr1);
        arr3.addAll(arr2);

        return arr3;

    }


}
/*
Create a static method that:

is called combineAL
returns an ArrayList<Integer>
takes two parameters: an ArrayList of Integers called list, and an ArrayList of Integers called list2
This method should create a new ArrayList of Integers, add all the words (in order) from list,
then add all the words (in order) from list2. In other words,
it is combining all the elements from the two parameters.
 */