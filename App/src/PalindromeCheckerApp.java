import java.util.LinkedList;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "level";

        LinkedList<Character> list = new LinkedList<>();

        // Add each character to the linked list
        for (char c : input.toCharArray()) {
            list.add(c);
        }

        // Flag to track palindrome state
        boolean isPalindrome = true;

        // Compare front and rear elements until one or zero elements remain
        while (list.size() > 1) {
            if (!list.removeFirst().equals(list.removeLast())) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input String: " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}