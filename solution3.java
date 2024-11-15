import java.util.Scanner;

public class solution3 {
    public static void main(String[] args) {
        // Build a menu-driven calculator that performs addition, subtraction,
        // multiplication, or division based on the user's choice. Use if-else
        // statements to determine the operation.
        // Keep prompting the user to perform another operation until they choose
        // to exit.

        Scanner sc = new Scanner(System.in);
        int op, n1, n2, res, ans = 0;
        try {
            System.out.println("Calcultor Program");
            while (true) {
                System.out.println("------Welcome-----");
                System.out.println("Enter the first number");
                n1 = sc.nextInt();
                System.out.println("Enter the second number");
                n2 = sc.nextInt();
                System.out.println("Choose a operation...");
                System.out.println("Enter 1 for Addition ");
                System.out.println("Enter 2 for Subtraction ");
                System.out.println("Enter 3 for Multiplication ");
                System.out.println("Enter 4 for Division ");
                op = sc.nextInt();
                if (op != 1 && op != 2 && op != 3 && op != 4) {
                    continue;
                }
                if (op == 4 && n2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                    System.out.println("Re-initializing... ");
                    continue;
                }
                if (op == 1) {
                    ans = n1 + n2;
                } else if (op == 2) {
                    ans = n1 - n2;
                } else if (op == 3) {
                    ans = n1 * n2;
                } else if (op == 4){
                    ans = n1 / n2;
                }
                System.out.println("Answer = " + ans);
                System.out.println("To perform another calculation Press 1 and Enter");
                System.out.println("To Exit Press 2 and Enter");
                res = sc.nextInt();
                if (res == 2) {
                    System.out.println("Exiting...");
                    System.exit(0);
                } else {
                    continue;
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        sc.close();
    }
}
