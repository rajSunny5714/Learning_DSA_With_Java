package BasicAndLoops;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String output = transformString(input);
        System.out.println(output);
    }
    public static String transformString(String input) {
        // Convert the input string to lowercase
        input = input.toLowerCase();
        StringBuilder result = new StringBuilder();
        int n = input.length();
        for (int i = 0; i < n; ) {
            char currentChar = input.charAt(i);
            int count = 1;
            while (i + count < n && input.charAt(i + count) == currentChar) {
                count++;
            }
            if (count > 1) result.append(count).append(currentChar);
            else result.append(currentChar);
            i+= count;
        }
        return result.toString();
    }
}




















