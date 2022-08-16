package melek_Package;

import java.util.Scanner;

public class OnlineBookMerchant {

    public static void main(String[] args) {
        int freeBooks = 0;
        Scanner scan = new Scanner(System.in);
        boolean isPremiumCustomer = scan.nextBoolean();
        int nbooksPurchased = scan.nextInt();

        System.out.println(onlineBooks(isPremiumCustomer,nbooksPurchased));
    }

    public static int onlineBooks(boolean isPremiumCustomer, int bookPurchase) {
        int result = 0;

        if (isPremiumCustomer) {
            if (bookPurchase >= 5 && bookPurchase < 8) {
                result = 1;
            } else if (bookPurchase >= 8) {
                result = 2;
            }
        } else {
            if (bookPurchase >= 7 && bookPurchase < 12) {
                result = 1;
            } else if (bookPurchase >= 12) {
                result = 2;
            }

        }
        return result;
    }
}
/*
Online Book Merchants offers premium customers 1 free book with every purchase of 5 or more books and offers 2 free books with every purchase of 8 or more books.
 It offers regular customers 1 free book with every purchase of 7 or more books, and offers 2 free books with every purchase of 12 or more books.

Write a program that assigns freeBooks the appropriate value based on the values of the boolean variable
isPremiumCustomer and the int variable nbooksPurchased. Print amount of freeBooks into the console.
 */
