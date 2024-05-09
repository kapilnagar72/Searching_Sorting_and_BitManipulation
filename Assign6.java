package Searching_Sorting_and_BitManipulation;

/*Q4. 3 iterations are required
Original Array is {3 5 1 6 0}
In first iteration array is {5 3 6 1 0}
In second iteration array is {5 6 3 1 0}
In third iteration array is {6 5 3 1 0} */


public class Assign6 {
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
                // Swap the found minimum element with the first element of the unsorted portion
                int temp = arr[maxIndex];
                arr[maxIndex] = arr[i];
                arr[i] = temp;
            }
        }

        public static void printArray(int[] arr) {
            for (int value : arr) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }


