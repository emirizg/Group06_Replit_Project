package interview_questions;

public class LettersDigitsSpecialCh_Elif {

    public static void main(String[] args) {

        String str = "mn@#123Ab!";

        String digits = "";
        String letters = "";
        String specialChars = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch >= '0' && ch <= '9'){
                digits += ch;
            }else if (ch >= 'A' && ch <= 'Z'){
                letters += ch;
            }else if(ch >= 'a' && ch <= 'z'){
                letters += ch;
            }else {
                specialChars += ch;
            }

        }

        System.out.println("specialChars = " + specialChars);
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);


    }

}
/*
5. write a program that can retive the digits, letters and special
characters from a string
Ex:
input:
mn@#123Ab!
output:
letters: mnAb
digits: 123
special chars: @#!
 */