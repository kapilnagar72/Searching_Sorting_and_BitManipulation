package Searching_Sorting_and_BitManipulation;

import java.util.Arrays;

public class InsertionSort1 {
    public static void insertionSort(int [] arr)
{
    for(int i=1; i<arr.length; i++){
        int j = i;
        while (j>0 && arr[j]<arr[j-1]) {
            // swap the element 
            int temp = arr[j];
            arr[j] = arr[j-1];
            arr[j - 1] = temp;
            j--;
        }
    }
}
public static void main(String[] args) {
    int[] arr = { 40,30,20,10,5};
    //function calling
    insertionSort(arr);
    System.out.println("sorted arrays is: ");
    System.out.println(Arrays.toString(arr));
}
}
