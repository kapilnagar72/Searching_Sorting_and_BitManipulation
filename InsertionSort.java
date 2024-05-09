package Searching_Sorting_and_BitManipulation;

import java.util.*;
//import java.io.*;
//import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int [] arr)
    {
        for(int i=1; i<arr.length; i++){
            int j = i;
            while (j>0 && arr[j]<arr[j-1]) {
                // swap the element 
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = { 20, 50, 25, 67, 79, 12, 15 };
        //function calling
        insertionSort(arr);
        System.out.println("sorted arrays is: ");
        System.out.println(Arrays.toString(arr));
    }
}
