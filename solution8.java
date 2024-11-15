import java.util.Scanner;

public class solution8 {
    public static void main(String[] args) {
        // Write a program that takes an integer input n and prints an inverted
        // triangle of numbers. For example, if n = 5, the output should be:
        // 5 4 3 2 1
        // 4 3 2 1
        // 3 2 1
        // 2 1
        // 1
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height of the pyramid");
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
