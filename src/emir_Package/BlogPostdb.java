package emir_Package;

import java.util.ArrayList;
import java.util.Scanner;

public class BlogPostdb {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        String id = in.next();
        in.nextLine();
        ArrayList<String[]> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(new String[]{in.nextLine(), in.nextLine(), in.nextLine()});
        }

        System.out.println(blogDb(list, id));

    }

    public static String blogDb(ArrayList<String[]> r, String id) {

        String result = "";

        for (String[] array : r) {

            for (int i = 0; i < array.length; i++) {

                if (array[i].contains(id)) {
                    result = array[1] + "\n" + array[2];
                } else if (array[i].contains(id)) {
                    result = array[1] + "\n" + array[2];
                } else if (array[i].contains(id)) {
                    result = array[1] + "\n" + array[2];
                }

            }

        }


        return result;
    }


    // Do not touch below


}
/*
This task is optional, since we did not practice ArrayLists in this way.

blogDb gets an ArrayList of String Arrays(ArrayList<String[]>) from a database,
each row from the database table is represented by a position in the ArrayList. each ArrayList position holds a string array that holds the row data.

the database table columns are : id(string),title(string), content(string).

ArrayList<String[]> r example:

Each item in ArrayList is a String Array

r = [
["1","title","content1"],
["2","another title","content2"],
["3","yet another title","content3"]
]
the String id argument of blogDb method is referring to a row from the table the arraylist holds.

You need to loop through each element in the ArrayList and find the matching String[] with that id.

Then return the title and content in the format below.

Example:

blogDb(r,"1")

returns:
title
content1
blogDb(r,"2")

returns:
another title
content2
 */