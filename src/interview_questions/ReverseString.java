package interview_questions;

public class ReverseString {
    public static void main(String[] args) {
        String str= "Wooden Spoon";
        String reversed="";



            for(int j=str.length()-1; j>=0; j--){
                char ch = str.charAt(j);
                      reversed += ch;
            }
        System.out.println(reversed);
    }


}
