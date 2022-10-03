package interview_questions;

public class Palindrome {
    public static void main(String[]args){
        String str="Level";
        String reversed= "";

        for(int i=str.length()-1;i>=0; i--){
            char ch= str.charAt(i);
            reversed += ch;
        }
        boolean result= str.equalsIgnoreCase(reversed);
        System.out.println(result);
    }

}
