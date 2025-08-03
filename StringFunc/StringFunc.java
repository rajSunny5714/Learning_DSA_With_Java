package StringFunc;
import java.util.Scanner;

public class StringFunc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String input = sc.nextLine();

        StringBuilder result = new StringBuilder();
        for (String word : input.split(" ")) {
            StringBuilder transformedWord = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if (Character.isDigit(c)) {
                    int repeatCount = Character.getNumericValue(c);
                    if (i + 1 < word.length()) {
                        char nextChar = word.charAt(i + 1);
                        transformedWord.append(String.valueOf(nextChar).repeat(repeatCount));
                        i++;
                    }
                }
                else {
                    transformedWord.append(c);
                }
            }
            result.append(transformedWord).append(" ");
        }
        System.out.println(result.toString().trim());
    }
}
