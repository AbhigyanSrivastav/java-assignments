import java.util.Scanner;

public class solution4 {
    static boolean checkPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left <= right) {
            if (s.charAt(left) != s.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        // Accept a string input from the user and check if it’s a palindrome (a word
        // that reads the same forwards and backwards). Create a method to
        // reverse the string and compare it to the original to determine if it’s a
        // palindrome.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to check if its a Palindrome");
        String input = sc.nextLine().trim();

        if (input.equals("") || input.equals(" ")) {
            System.out.println("Invalid input");
        } else if (checkPalindrome(input)) {
            System.out.println(input + " is a palindrome");
        } else {
            System.out.println(input + " is not a palindrome");
        }
        sc.close();
    }
}
