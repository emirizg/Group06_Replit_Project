package melek_Package;

import java.util.Scanner;

public class ThunderBlazz {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(getThunderBlazz(in.nextBoolean(), in.nextBoolean(), in.nextInt(), in.nextInt(), in.nextInt()));
    }





    public static boolean getThunderBlazz(boolean available, boolean gift, int ingredient1, int ingredient2, int ingredient3) {

        boolean result=false;

       boolean ingredients=false;

       if((ingredient1==1 && ingredient2==2&&ingredient3==3)||(ingredient1==3&&ingredient2==1&&ingredient3==2)){
           ingredients=true;
       }

        if(available==true || gift==true || ingredients==true ){
            result=true;
        }



return result;
    }


}


/*
There are a few ways to get this galacticly popular drink, if its available at the store you can buy it. or you can get it as a gift.
 The third option is to mix its ingredients (its a secret formula):

1 from ingredient1 ,2 from ingredient2 and 3 from ingredient3.

or the alternate recipe: 3 from ingredient1, 1 from ingredient2 and 2 from ingredient3.

You need to have exact amount of ingredients for making the drink. not less or more

getThunderBlazz(boolean avilable,boolean gift, int ingredient1,
   int ingredient2, int ingredient3)
available(boolean) = available at store gift(boolean) = got it as a gift the three ingredients as ints
 */