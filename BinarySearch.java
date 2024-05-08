package Searching_Sorting_and_BitManipulation;

import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Enter the total number of elements in the array
            System.out.println("Enter the number of elements in the array:");
            int n = sc.nextInt();

            // Enter the array elements
            System.out.println("Enter the array elements:");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // Sort the array (binary search requires a sorted array)
            Arrays.sort(arr);

            // Enter the target element to search for
            System.out.println("Enter the target element:");
            int x = sc.nextInt();

            // Perform binary search
            int idx = binarySearch(arr, x);

            // Display the result
            if (idx == -1) {
                System.out.println("The search element was not found in the array.");
            } else {
                System.out.println("The search element was found at index: " + idx);
            }
        }
    }

    // Binary search implementation
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if target is present at mid
            if (arr[mid] == target) {
                return mid;
            }

            // If target is greater, ignore left half
            if (arr[mid] < target) {
                left = mid + 1;
            } else { // If target is smaller, ignore right half
                right = mid - 1;
            }
        }

        // If the element is not present in the array
        return -1;
    }
}
