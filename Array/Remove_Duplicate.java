package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Remove_Duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
           arr[i] = sc.nextInt();
        }
        int[] remove = Arrays.stream(arr).distinct().toArray();
        System.out.println(Arrays.toString(remove));
    }
}
