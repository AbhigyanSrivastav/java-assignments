import java.util.Scanner;

public class solution2 {
    static boolean checkPrime(int i) {
        if (i <= 1)
            return false;
        int pntr = 2;
        while (pntr * pntr <= i) {
            if (i % pntr == 0)
                return false;
            pntr++;
        }
        return true;
    }

    public static void main(String[] args) {
        // Create a program that accepts 10 integers from the user, stores them in
        // an array, and then prints only the prime numbers in that array.
        // Implement a separate method to check if a number is prime.
        Scanner sc = new Scanner(System.in);
        try {
            int[] arr = new int[10];
            System.out.println("Enter 10 numbers");
            for (int i = 0; i < arr.length; i++) {
                System.out.println("Enter Number ");
                arr[i] = sc.nextInt();
            }
            System.out.println("Printing only prime numbers...");
            for (int i : arr) {
                if (checkPrime(i)) {
                    System.out.println(i + " is Prime Number");
                }
            }
        } catch (Exception e) {
            System.out.println(e);
            System.exit(1);
        }
        sc.close();
    }
}
