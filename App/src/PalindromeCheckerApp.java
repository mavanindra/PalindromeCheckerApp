import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input : ");
        String input = sc.nextLine();

        // Capture start time
        long startTime = System.nanoTime();

        boolean isPalindrome = checkPalindrome(input);

        // Capture end time
        long endTime = System.nanoTime();

        long executionTime = endTime - startTime;

        System.out.println("Is Palindrome? : " + isPalindrome);
        System.out.println("Execution Time : " + executionTime + " ns");

        sc.close();
    }

    // Palindrome checking method
    public static boolean checkPalindrome(String input) {

        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (Character.toLowerCase(input.charAt(start)) !=
                    Character.toLowerCase(input.charAt(end))) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}