import java.util.Scanner;

public class solution5 {
    public static void main(String[] args) {
        // Write a program that takes an integer input n and stores the first n terms
        // of the Fibonacci sequence in an array. Then, print the array. For example,
        // if the user enters 7, store and display the first 7 terms of the Fibonacci
        // sequence: 0, 1, 1, 2, 3, 5, 8.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Fibonacci sequence to display");
        int n = sc.nextInt();
        int[] fibo = new int[n];

        int n1 = 0;
        int n2 = 1;
        fibo[0] = 0;
        fibo[1] = 1;
        for (int i = 2; i < fibo.length; i++) {
            fibo[i] = n1 + n2;
            n1 = n2;
            n2 = fibo[i];
        }
        System.out.println("First " + n + " Fibonacci numbers are:");
        for (int i = 0; i < fibo.length; i++) {
            System.out.print(" " + fibo[i] + " ");
        }
        sc.close();
    }
}
