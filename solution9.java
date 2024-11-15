import java.util.Scanner;

public class solution9 {
    public static void main(String[] args) {
        // Implement a program that accepts an integer input n and prints Floyd's
        // Triangle up to n rows. Floyd’s Triangle has consecutive numbers starting
        // from 1. For example, if n = 4, the output should be:
        // 1
        // 2 3
        // 4 5 6
        // 7 8 9 10
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height for floyds triangle");
        int n = sc.nextInt();
        int cnt = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((cnt++) + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
