import java.util.Scanner;

public class BinarySum {
    public static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        // Loop through both strings from end to start
        while (i >= 0 || j >= 0 || carry > 0) {
            int bitA = (i >= 0) ? a.charAt(i--) - '0' : 0;
            int bitB = (j >= 0) ? b.charAt(j--) - '0' : 0;

            int sum = bitA + bitB + carry;
            result.append(sum % 2); // Append result bit
            carry = sum / 2;        // Update carry
        }

        return result.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input
        System.out.print("Enter first binary number (a): ");
        String a = scanner.nextLine();

        System.out.print("Enter second binary number (b): ");
        String b = scanner.nextLine();

        // Output result
        String sum = addBinary(a, b);
        System.out.println("Sum: " + sum);

        scanner.close();
    }
}
