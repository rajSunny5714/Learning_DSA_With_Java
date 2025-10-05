package PatternPrint;

import java.util.Scanner;

public class SolidRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int b = sc.nextInt();
        for (int i = 1; i <= l; i++) {
            for (int j = 1; j <= b; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
