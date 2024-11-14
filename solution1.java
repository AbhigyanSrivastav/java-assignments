import java.util.Scanner;

public class solution1 {
    public static void main(String[] args) {
        // Write a Java program that takes an integer input from the user and
        // calculates the factorial of the number. Then, write a method to calculate
        // the sum of the digits of this factorial. For example, if the user enters 5,
        // calculate 5! (120) and then find the sum of its digits (1 + 2 + 0 = 3).

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to calculate factorial and the sum of it's digits");
        int n = sc.nextInt();
        int k = n; // copy of orignal input
        int fact = k;
        int sumOfNo = 0;
        while (k-- > 1) {
            fact = fact * (k);

        }
        System.out.println("Factorial of " + n + " is = " + fact);
        while (fact > 0) {
            sumOfNo += (fact % 10);
            fact = fact / 10;
        }
        System.out.println("Sum of the digits is = " + sumOfNo);

        sc.close();
    }
}
