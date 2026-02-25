public class PalindromeCheckerApp {

    public static void main(String[] args) {
        String input = "madam";
        boolean result = check(input, 0, input.length() - 1);
        System.out.println("Input String: " + input);
        System.out.println("Is Palindrome? : " + result);
    }

    // Recursive method to check palindrome
    private static boolean check(String s, int start, int end) {
        if (start >= end) {
            return true; // Base case: all characters matched
        }
        if (s.charAt(start) != s.charAt(end)) {
            return false; // Mismatch found
        }
        return check(s, start + 1, end - 1); // Recursive call
    }
}