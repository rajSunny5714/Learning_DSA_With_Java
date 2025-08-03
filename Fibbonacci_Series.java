import java.util.Scanner;

public class Fibbonacci_Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int first=0, second=1;
        System.out.print(first+" "+second+" ");
        for (int i = 2; i < n; i++) {
            int temp = first + second;
            System.out.print(temp+" ");
            first = second;
            second = temp;
        }
    }
}
