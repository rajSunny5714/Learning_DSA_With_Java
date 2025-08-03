package Array;

import java.util.Scanner;

public class ArrayProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        int sub = 0;
        int product = 1;
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                sum+=arr[i][j];
                sub-=arr[i][j];
                product*=arr[i][j];
            }
        }
        System.out.println(sum);
        System.out.println(sub);
        System.out.println(product);
    }
}
