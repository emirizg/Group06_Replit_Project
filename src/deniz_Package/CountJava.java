package deniz_Package;

import java.util.Scanner;

public class CountJava {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String word = scan.next();

        int count= 0;

        while(word.contains("java")){
            word.replaceFirst("java","");
            count++;
        }

        System.out.println(count);
    }
}
