package emir_Package;

import java.util.Scanner;

public class BadProducts_Methods {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] nums = new int[in.nextInt()];
        for(int i=0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        int limit = in.nextInt();

        System.out.println(badP(nums, limit));
    }

    public static boolean badP(int[] products,int limit){


        int counter = 0;

        for (int each : products) {

            if (each == 0){
                counter++;
            }

        }

        if (counter >= limit){
            return false;
        }else {
            return true;
        }

    }



}
/*
products(int[]) - is an int array representing the products it checked,
if the item is intact it will be represented by 1 if its broken its 0.
for example: [0,1,1,1,0], this array represents 2 broken items and 3 intact.

limit(int) - represents the max amount of broken items for this shipment to be considered good
(and the method returns true) for example : products [1,1,1,1,0] limit:3,
there is only 1 broken product and its less then the limit (3) return true.

Examples:

badP([1,1,1,1],5)
returns true

badP([1,1,1,1,0,0,0,0],2)
returns false

badP([1,1,0,0],2)
returns false

badP([1,1,1,0],6)
returns true
hint:

create a counter, loop the products, increment it for each 0 you find.
finally compare counter to limit and return true or false
 */