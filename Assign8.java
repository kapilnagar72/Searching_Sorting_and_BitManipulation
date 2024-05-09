package Searching_Sorting_and_BitManipulation;

/*
 * Q2. Number 15. Converting it in binary 1111, as its more than 1 set bits in
 * the binary representation therefore it’s
 * not power of 2.
 * Number 32. Converting it to binary 10000, as it has only 1 set bit, therefore
 * its power of 2.
 */

 import java.util.Scanner;

public class Assign8{
    public static void main(String[] args) {
        int number;
        System.out.println("Enter the integer: ");

        // Create Scanner object
        Scanner s = new Scanner(System.in);

        // Read the next integer from the screen
        number = s.nextInt();

        if ((number & 1) == 1)
            System.out.println("Given number is odd.");
        else
            System.out.println("Given number is even.");
        s.close();
    }
}
