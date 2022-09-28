package emir_Package;

import java.util.Scanner;

public class VendingMachine_Statements {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter cents: ");
        int amount = scan.nextInt();

        int quarters = 0;
        int dimes = 0;
        int nickels = 0;
        int pennies = 0;

        //System.out.println("amount = " + amount);

        if (amount < 0 || amount > 100) {
            System.out.println("Invalid cents amount");
        } else {

            quarters = amount / 25;

            amount = amount - quarters*25;

            dimes = amount / 10;

            amount = amount - dimes*10;

            nickels = amount / 5;

            amount = amount - nickels*5;

            pennies = amount / 1;

            amount = amount - pennies*1;

            System.out.println("Your change is "+quarters+" quarters, "+dimes+" dimes, "+nickels+" nickels, and "+pennies+" pennies");

        }




    }

}
