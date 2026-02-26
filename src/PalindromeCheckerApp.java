import java.util.Stack;
public class PalindromeCheckerApp {

    /*
    UC6
     */
    
        public static void main(String[] args) {
            String input = "civic";

            // Convert string to char array
            char[] charArray = input.toCharArray();

            boolean isPalindrome = true;

            // Use start and end pointers
            int start = 0;
            int end = charArray.length - 1;

            // Compare characters efficiently
            while (start < end) {
                if (charArray[start] != charArray[end]) {
                    isPalindrome = false;
                    break;
                }
                start++;
                end--;
            }

            // Display the result
            System.out.println("Input : " + input);
            System.out.println("Is Palindrome? : " + isPalindrome);
        }
    }