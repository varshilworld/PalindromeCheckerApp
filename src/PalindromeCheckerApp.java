public class PalindromeCheckerApp {

    /*
    UC2
     */
    public static void main(String[] args) {
        String input = "madam";
        boolean palindrome = true;

        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                palindrome = false;
                break;
            }
        }

        if (palindrome)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}