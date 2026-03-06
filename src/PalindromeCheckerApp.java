import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;
public class PalindromeCheckerApp {

    /*
    UC11
     */




    public static void main(String[] args) {
        String input = "racecar";

        // Instantiate the service
        PalindromeService service = new PalindromeService();

        // Perform the check
        boolean result = service.checkPalindrome(input);

        // Display output
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}

class PalindromeService {

    public boolean checkPalindrome(String input) {
        // Initialize pointers
        int start = 0;
        int end = input.length() - 1;

        // Compare characters moving inward
        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}











