package interview_questions;

import java.util.Scanner;

public class HighestFrequency {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");

        String str = scan.next();
        String result="";
        int maxFrequency=0;
        for(int i=0; i<str.length();i++){
            int count=0;
            char ch = str.charAt(i);
            for(int j=0; j<str.length();j++){

                if(ch==str.charAt(j)){
                    count++;
                }
            }
            if(count>maxFrequency){
                maxFrequency=count;
                result+=ch+"";
            }

        }
        System.out.println(result+":"+maxFrequency);
    }
}
