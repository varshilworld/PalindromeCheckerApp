import java.util.Stack;
public class PalindromeCheckerApp {

    /*
    UC5
     */


        public static void main(String[] args) {

            String input = "noon";

            Stack<Character> stack = new Stack<>();

            // push characters
            for (char c : input.toCharArray()) {
                stack.push(c);
            }

            boolean isPalindrome = true;

            // compare while popping
            for (char c : input.toCharArray()) {
                if (c != stack.pop()) {
                    isPalindrome = false;
                    break;
                }
            }

            System.out.println("Input : " + input);
            System.out.println("Is Palindrome? : " + isPalindrome);
        }
    }