package emir_Package;

import java.util.Arrays;
import java.util.Scanner;

public class LameDB_Methods {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(lameDb(in.next(), in.next(), in.next(), in.next()));

    }


    public static String lameDb(String db, String op, String id, String data) {

        String[] arr = db.split("#");
        int number = Integer.parseInt(id);

        //System.out.println("number = " + number);

        //System.out.println(arr.length);


        if (op.equals("add")) {

            // deleting numbers and '#'
            String[] printArray = new String[arr.length];

            int j=0;
            for (String each : arr) {

                if (each == null){
                    continue;
                }
                //System.out.println("each = " + each);
                printArray[j++] = each.substring(1);

            }

            //creating new array and adding new element
            String[] addArr = new String[printArray.length + 2];

            int i = 1;
            for (String each : printArray) {

                if (number == i){
                    //addArr[i] = data;
                    i++;

                }

                addArr[i++] = each;

            }

            addArr[number] = data;

            //removing null element and re-adding numbers and '#'
            String[] lastArray = new String[arr.length + 1];

            int g = 0;
            for (String each : addArr) {

                if (each == null){
                    continue;
                }

                if (g == 0){
                    lastArray[g++] = g + each;
                } else {
                    lastArray[g++] = "#" + g + each;
                }


            }

            // adding lastArray elements into 'a'
            String a ="";
            for (String each : lastArray) {

                a+=each;

            }

            //String a = Arrays.toString(lastArray);

            return a;

        } else if (op.equals("edit")) {

            // deleting numbers and '#'
            String[] printArray = new String[arr.length];

            int j=0;
            for (String each : arr) {

                if (each == null){
                    continue;
                }
                //System.out.println("each = " + each);
                printArray[j++] = each.substring(1);

            }

            //creating new array and editing/replacing new element
            String[] replacedArray = new String[printArray.length+1];

            int i = 1;
            for (String each : printArray) {

                if (number == i){
                    replacedArray[i] = data;
                    i++;
                    continue;
                }

                replacedArray[i++] = each;

            }

            //removing null element and re-adding numbers and '#'
            String[] lastArray = new String[arr.length];

            int g = 0;
            for (String each : replacedArray) {

                if (each == null){
                    continue;
                }

                if (g == 0){
                    lastArray[g++] = g + each;
                } else {
                    lastArray[g++] = "#" + g + each;
                }


            }

            // adding lastArray elements into 'a'
            String a ="";
            for (String each : lastArray) {

                a+=each;

            }


            //String a = Arrays.toString(lastArray);

            return a;

        } else if (op.equals("delete")) {

            // deleting numbers and '#'
            String[] printArray = new String[arr.length];

            int j=0;
            for (String each : arr) {

                if (each == null){
                    continue;
                }
                //System.out.println("each = " + each);
                printArray[j++] = each;

            }

            //creating new array and deleting element
            String[] deletdArray = new String[printArray.length+1];

            int i = 1;
            for (String each : printArray) {

                if ( i == number ){
                    i++;
                    continue;
                }

                deletdArray[i++] = each;

            }

            //removing null element and re-adding '#'
            String[] lastArray = new String[arr.length-1];

            int g = 0;
            for (String each : deletdArray) {

                if (each == null){
                    continue;
                }

                if (g == 0){
                    lastArray[g++] = each;
                } else {
                    lastArray[g++] = "#" + each;
                }


            }



            // adding lastArray elements into 'a'
            String a ="";
            for (String each : lastArray) {

                a+=each;

            }


            //String a = Arrays.toString(lastArray);

            return a;

        }



        String r = Arrays.toString(arr);



        return r;
    }//end lameDb

}
/*
Examples:

m.lameDb("1etsy#2wooden#3spoon","add","4","aaa")
returns:  1etsy#2wooden#3spoon#4aaa

m.lameDb("1etsy#2wooden#3spoon","add","1","bbb")
returns:  1bbb#2etsy#3wooden#4spoon

m.lameDb("1test#2bla#3foo","edit","2","bbb")
returns:  1test#2bbb#3foo

m.lameDb("1tst#2bla#3foo","delete","1","")
returns:  2bla#3foo
Hint: use arrays

Implement the lameDb() method

This method has 4 String parameters and returns a String

db: information in database. Each item is separated by a #.
Each element will also have a number in the beginning about which element it is.

op: action that will be taken on database (add, edit, or remove)

id: The id number that will be manipulated

data: extra data that will be used alongside operation
The method returns the modifed database
 */