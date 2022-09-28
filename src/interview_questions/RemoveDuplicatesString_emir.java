package interview_questions;

public class RemoveDuplicatesString_emir {

    //Remove duplicates from String

    public static void main(String[] args) {

        String str = "abcdajdaaabba";
        String removed = "";

        for (int i = 0; i < str.length(); i++) {

            String ch = str.charAt(i)+"";

            if (removed.contains(ch)){
                continue;
            }else {
                removed+=ch;
            }

        }

        System.out.println("removed = " + removed);

    }

}


