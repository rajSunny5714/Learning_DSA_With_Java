package Array;

import java.util.Scanner;

public class RowAirthmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m+1];
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<m; i++) {
            int sum = 0;
            for(int j=0; j<n; j++) {
                for(int k=0; k<n; k++) {
                    sum = arr[i][k]+arr[k][j];
                }
                arr[i][j] = sum;
            }
        }
        for(int i=0; i<n; i++) {
            for(int j=0; j<m+1; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
