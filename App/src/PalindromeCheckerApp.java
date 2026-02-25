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
    }
}