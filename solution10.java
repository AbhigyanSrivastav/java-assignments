import java.util.Scanner;

public class solution10 {
    public static int countOccurence(String s, char c) {
        int n = s.length() - 1;
        int cnt = 0;
        while (n >= 0) {
            if (s.charAt(n) == c) {
                cnt++;
            }
            n--;
        }
        return cnt;
    }

    public static void main(String[] args) {
        // Take a string input from the user and a character to search for. Write a
        // method to count the occurrences of the character in the string and return
        // the count. Then display the count to the user.
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the String");
            String s = sc.nextLine().trim().toLowerCase();
            if (s.equals("") || s.equals(" ") || s.length() < 0) {
                System.out.println("Invalid String");
            } else {
                System.out.println("Enter the character to search");
                String c = sc.nextLine().trim().toLowerCase();
                if (c.equals("") || c.equals(" ") || c.length() < 0 || c.length() > 1) {
                    System.out.println("Invalid character");
                } else {
                    int n = countOccurence(s, c.charAt(0));
                    System.out.println(c + " occured in " + s + " " + n + " times");
                }
            }
            sc.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
