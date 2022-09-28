package interview_questions;

public class LettersDigitsSpecialCh_melek {


    public static void main(String[] args) {

        String str="mn@#123Ab!";

        String digits="";

        String letters="";

        String speacialChars="";


        for(int i=0; i<str.length();i++){
            char ch=str.charAt(i);


            if(ch>='0'&& ch<='9'){
                digits+=ch;
            }else if(ch>='A'&& ch<='Z'){
                letters+=ch;
            }else if(ch>='a' && ch<='z'){
                letters+=ch;
            }else{
                speacialChars+=ch;
            }
        }

        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("speacialChars = " + speacialChars);

//Ex:
//input:
//mn@#123Ab!
//output:
//letters: mnAb
//digits: 123
//special chars: @#!









    }
}
