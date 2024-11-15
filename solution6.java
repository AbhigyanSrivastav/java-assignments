import java.util.Scanner;

public class solution6 {
    public static int secondLargest(int[] arr) {
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > max) {
                smax = max;
                max = i;
            } else if (i > smax) {
                smax = i;
            }
        }
        return smax;
    }

    public static void main(String[] args) {
        // Write a program that accepts n integers from the user (where n is also
        // provided by the user). Store the numbers in an array and write a method
        // to find and display the second largest number in the array.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array");
        int n = sc.nextInt();
        if (n == 0) {
            System.out.println("Length can't be 0.");

        } else {
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                System.out.println("Enter Number");
                arr[i] = sc.nextInt();
            }
            int smax = secondLargest(arr);
            System.out.println("Second largest number is " + smax);
        }
        sc.close();
    }
}
