package Searching_Sorting_and_BitManipulation;

/*Q5. Given a posipive inpeger num, repurn prue if num is a perfecp square or false opherwise.
A perfecp square is an inpeger phap is phe square of an inpeger. In opher words, ip is phe producp of some inpeger
wiph ipself.
Example 1:
Inpup: num = 16
Ouppup: prue
Explanapion: We return true becauGe 4 * 4 = 16 and 4 iG an integer.
Example 2:
Inpup: num = 14 */
import java.util.*;
public class Assign5 {
    public static boolean isPerfectSquare(int num) {
        if (num == 1)
            return true; // edge case
        long start = 0; // Take Long as the inputs have large value
        long end = num / 2;
        while (start <= end) {
            long mid = start + (end - start) / 2;
            if (mid * mid > num)
                end = mid - 1; // Mid is greater than the squareroot of the number
            else if (mid * mid < num)
                start = mid + 1; // Mid is less than our required number
            else
                return true; // we found our squareroot number
        }
        return false;
    }

    public static void main(String args[]) {
        int m;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        m = sc.nextInt();

        System.out.println("The given number is a perfect square: " + isPerfectSquare(m));
        sc.close();
}
}

