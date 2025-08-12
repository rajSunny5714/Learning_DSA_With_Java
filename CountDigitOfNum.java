package BasicAndLoops;

import java.util.Scanner;

public class CountDigitOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        num = Math.abs(num);
        int count;
        if (num == 0) {
            count = 1;
        } else {
            count = (int) Math.floor(Math.log10(num)) + 1;
        }
        System.out.println("Number of digits: " + count);
    }
}
