package Searching_Sorting_and_BitManipulation;

import java.util.*;

public class LinearSearch {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Enter the arrays total element 
            System.out.println("Enter the number of element in present arrays");
            int n = sc.nextInt();

            // Enter the arrrays 
            System.out.println("Enter the arrays element ");
            int[] arr = new int[n];

            for (int i=0; i<n; i++)
            {
                arr[i] = sc.nextInt();
            }
            System.out.println("Enter the target arrays");
            int x = sc.nextInt();
            
            //implementation of LinearSearch
            int idx = -1;
            for (int i = 0; i<n; i++)
            {
                if (arr[i] == x) {
                    idx =i;
                    break;
                }
            }
            if (idx ==-1) {
                System.out.println("search element are not found in arrays");

            }
            else
            {
                System.out.println("search element are found in arrays loaction " + idx);
            }
        }
    }
}
