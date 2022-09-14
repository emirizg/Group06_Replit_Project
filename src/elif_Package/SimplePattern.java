package elif_Package;

public class SimplePattern {

        public static void printHollowRect(){
            // write your codes here
            for (int i = 0; i < 5; i++) {

                for (int j = 0; j < 5; j++) {
                    if (i == 0 || i == 4){
                        System.out.print("*");
                    }else if(j == 0 || j == 4){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }


        }

        public static void main(String[] args) {
            printHollowRect();
        }

    }

    /*
    Create a method **printHollowRect** that prints a 5 by 5 hollow rectangle:

```
*****
*   *
*   *
*   *
*****
```

hint: you will need to use two nested for loops,
and check if its the last or first iteration of the loop (so you will know whet to print "*" or " ")
     */