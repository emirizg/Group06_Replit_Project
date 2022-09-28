package interview_questions;

public class Palindrome_EMir {

    public static void main(String[] args){

        String str = "Level";
        String reversed ="";

        for(int i =  str.length()-1; i>=0; i--){
            reversed+=str.charAt(i);
        }

        boolean isPalindrome = str.equalsIgnoreCase(reversed);
        System.out.println("isPalindrome = " + isPalindrome);

    }


}
