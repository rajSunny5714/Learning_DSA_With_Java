package Array;

import java.util.Scanner;

public class Check_Sorted_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        if(isSorted(arr))
            System.out.println("Sorted");
        else
            System.out.println("Not Sorted");
    }
    public static boolean isSorted(int[] arr) {
        boolean ascending = true;
        boolean descending = true;
        for (int i=1; i<arr.length; i++) {
            if (arr[i]<arr[i-1]) {
                ascending = false;
            }
            if (arr[i]>arr[i-1]) {
                descending = false;
            }
        }
        return ascending || descending;
    }
}
