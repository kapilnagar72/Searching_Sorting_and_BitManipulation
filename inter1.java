package Searching_Sorting_and_BitManipulation;

import java.util.*;
public class inter1 {
    public static int finalFirstOccurrence(int [] arr ,int target)
    {
        int low =0;
        int high =arr.length-1;
        int result = -1;

        while (low <=high) {
            int mid = low+(high-low)/2;
            if (arr [mid] == target) {
                result = mid;
                high = mid-1;
            }
            else if(arr [mid] > target)
            {
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return result;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element in arrays");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the arrays element ");
         
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target arrays");
        int target = sc.nextInt();

        int result = finalFirstOccurrence(arr, target);
        
        if (result == -1) {
            System.out.println("target element are not present in arrays.");
            //if (result != -1) {
              //  System.out.println("target element are present in arrays");
                
            }
            else{
                System.out.println("target element are finalFisrtOccurrence: "+result);
            }
            sc.close();
        }
    
    }

