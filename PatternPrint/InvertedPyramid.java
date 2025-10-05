package PatternPrint;

import java.util.Scanner;

public class InvertedPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        for (int i = rows; i >= 1; i--) {
            for (int space = 0; space < rows - i; space++) {
                System.out.print(" ");
            }
            for (int star = 0; star < (2 * i - 1); star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
