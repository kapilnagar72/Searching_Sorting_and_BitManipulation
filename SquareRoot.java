package Searching_Sorting_and_BitManipulation;

import java.util.*;

public class SquareRoot {
    public static int finalSquareRoot(int num)
    {
        int low = 0, high = num, result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            long val = mid*mid;

            if (val == num) {
                return mid;
            }
            else if (val < num) {
                result = mid;
                low = mid + 1;
            }
            else {
                high = mid -1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number which you want square root");
        int num = sc.nextInt();

        int result = finalSquareRoot(num);
        System.out.println("square root of given number :" + result);
        
        sc.close();

    }

}