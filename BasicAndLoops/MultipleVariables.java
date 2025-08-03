package BasicAndLoops;

import java.util.Scanner;

public class MultipleVariables{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.print("Enter your height (in cm): ");
        float height = sc.nextFloat();
        System.out.print("Enter your monthly salary: ");
        double salary = sc.nextDouble();
        System.out.print("Are you married? (true/false): ");
        boolean isMarried = sc.nextBoolean();

        System.out.println("\n----- User Details -----");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years");
        System.out.println("Height: " + height + " cm");
        System.out.println("Salary: ₹" + salary + " per month");
        System.out.println("Married: " + isMarried);
    }
}
