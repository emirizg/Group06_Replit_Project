package interview_questions;

public class DigitsSpecialsLetters_Emir {

    public static void main(String[] args) {

        String str = "mn@#123Ab!";

        String digits = "",
                letters = "",
                specials = "";



        for (int i = 0; i < str.length(); i++) {

           char ch = str.charAt(i);

           if ((ch >= 'A' && ch < 'Z') || (ch > 'a' && ch < 'z')){
               letters+=ch;
           } else if (ch > '0' && ch < '9') {
               digits+=ch;
           }else {
               specials+=ch;
           }

        }

        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("specials = " + specials);

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