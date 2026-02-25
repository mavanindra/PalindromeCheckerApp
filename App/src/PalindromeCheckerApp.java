import java.util.Stack;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "noon";
        Stack<Character> stack = new Stack<>();

        // Push each character into the stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Check palindrome by popping from stack
        boolean isPalindrome = true;
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input String: " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}