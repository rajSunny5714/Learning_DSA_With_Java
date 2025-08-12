package BasicAndLoops;

import java.util.Scanner;

public class GcdOfTwoNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        System.out.println("GCD is: " + a);
    }
}
