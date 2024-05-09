package Searching_Sorting_and_BitManipulation;

/*
 * Q5. 3 iterations are required.
 * Original Array is {3 5 1 6 0}
 * In first iteration array is {6 5 1 3 0}
 * In second iteration array is {6 5 1 3 0}
 * In third iteration array is {6 5 3 1 0}
 * Now the array is sorted.
 */

 public class Assign7 {
    public static void main(String[] args) {
        int[] array = { 3, 5, 1, 6, 0 };
        selectionSortDesc(array);
        printArray(array);
    }

    public static void selectionSortDesc(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            if (maxIndex != i) {
                int temp = arr[maxIndex];
                arr[maxIndex] = arr[i];
                arr[i] = temp;
            }
            printArray(arr); // To show the array after each iteration
        }
    }

    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
