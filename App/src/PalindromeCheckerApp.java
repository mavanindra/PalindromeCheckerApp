import java.util.Scanner;
public class PalindromeCheckerApp {
    static String version = "1.0";
    public static void main(String[] args) {
        System.out.println("Welcome to Palindrome Checker Management System");
        System.out.println("Application Version: " + version);
        String str = "madam";
        String reversed = "";
        System.out.println("Input String: " + str);
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        if (str.equals(reversed)) {
            System.out.println("Palindrome: Yes");
        } else {
            System.out.println("Palindrome: No");
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to check palindrome:");
        String input = sc.nextLine();
        String reversedInput = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversedInput += input.charAt(i);
        }
        System.out.println("Input String: " + input);
        if (input.equals(reversedInput)) {
            System.out.println("Palindrome: Yes");
        } else {
            System.out.println("Palindrome: No");
        }
        sc.close();
    }
}