package deniz_Package;

import java.util.Scanner;

public class TicTocToe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char [] game = new char[9];
        for(int i=0; i < game.length; i++) {
            game[i] = in.next().charAt(0);
        }

        System.out.println(won(game));
    }



    public static String won(char[] x) {

        String result="";

        for(int i =0; i<x.length-2;i++ ) {
            if (x[i] == x[i + 1] && x[i + 2] == x[i]) {
                result = "Player " + x[i] + " won";
            }
        }
        for(int i =0; i<x.length-6;i++ ) {
            if (x[i] == x[i + 3] && x[i] == x[i + 6]) {
                result = "Player " + x[i] + " won";
            }


        }

    return result;
    }

}
/*
i 2 3
4 5 6
7 8 9
 */
