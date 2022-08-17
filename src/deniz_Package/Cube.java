package deniz_Package;

import java.util.Scanner;

public class Cube {
    public static void cube(){
        Scanner scan = new Scanner(System.in);
        int value = scan.nextInt();
        System.out.println(value*value*value);
    }



    //end cube

    public static void main(String[] args) {

        cube();

    }

}
