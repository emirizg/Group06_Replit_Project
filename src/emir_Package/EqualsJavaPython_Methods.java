package emir_Package;

import java.util.Scanner;

public class EqualsJavaPython_Methods {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();

        isEqual(sentence);

    }

    public static void isEqual(String sentence){

        int javaCounter = 0;
        int pythonCounter = 0;

        String[] arr = sentence.split(" ");

        for (String each : arr) {

            if (each.equalsIgnoreCase("java") || each.contains("java")){
                javaCounter++;
            } else if (each.equalsIgnoreCase("python") || each.contains("python")) {
                pythonCounter++;
            }

        }

        if (javaCounter == pythonCounter){
            System.out.println(true);
        }else {
            System.out.println(false);
        }

    }

}
/*
Given a string, print out true if the number of appearances of "java" anywhere in the string is equal
to the number of appearances of "python" anywhere in the string (case sensitive).

Example:
input: We study java not python
output: true

Example:
input: What's the difference between java, javascript and python?
output: false

Java is a general-purpose computer-programming language that is concurrent, class-based, object-oriented,[15] and
specifically designed to have as few implementation dependencies as possible.
 */