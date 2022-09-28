package interview_questions;

public class ReverseString_melek {

    public static void main(String[] args) {

        String str="Wooden Spoon";

        String reversed="";

        for(int i=str.length()-1; i>=0;i--){

       char ch=str.charAt(i);

        reversed+=ch;

        }

        System.out.println(reversed);





    }
}
