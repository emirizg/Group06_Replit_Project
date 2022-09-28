package interview_questions;

public class RemoveDuplicatesString_emir {

    //Remove duplicates from String

    public static void main(String[] args) {

        String str = "abcdajdaaabba";

        String removed = "";

        String[] arr = str.split("");

        for (int i=0; i<str.length() ; i++){

            String ch = str.charAt(i)+"";
            int counter = 0;
            if (arr[i].equals(ch)){
                counter++;
            }


        }

    }

}


