import java.util.Scanner;
public class mainsquar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = scanner.nextInt();
        scanner.close();
        // int x = 10;
        System.out.println("Square root of " + x + " using Brute Force: " + SquareRoot.sqrtBF(x));
        System.out.println("Square root of " + x + " using Divide and Conquer: " + SquareRoot.sqrtDC(x));
    }
}
