public class PalindromeCheckerApp {

    /*
    UC2
     */
    public static void main(String[] args) {
        String input = "madam";
        boolean palindrome = true;

        // Loop through half the string
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                palindrome = false;
                break;
            }
        }
// Print the original string
        System.out.println(input);
        
        // Print result
        if (palindrome)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");


    }
}