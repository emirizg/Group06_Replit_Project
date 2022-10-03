package emir_Package;

import java.util.Scanner;

public class PrintUniqueWords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        String[] words = new String[size];
        for(int i=0; i < size; i++){
            words[i] = scan.next();
        }
        printUniqueWords(words);
    }

    public static void printUniqueWords(String[] words){

        for (String eachWord : words) {

            int counter = 0;

            for (String word : words) {

                if (eachWord.equals(word)){
                    counter++;
                }

            }

            if (counter==1){
                System.out.println(eachWord);
            }

        }

    }

}
/*
Complete the void method printUniqueWords() that will print only unique words from an array of strings.
Every single unique word should be printed from the new line.

Example:
input:[java, code, python, code, rust, code, rust]

output:
java
python
 */