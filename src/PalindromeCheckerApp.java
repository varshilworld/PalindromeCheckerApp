public class PalindromeCheckerApp {

    /*
    UC2
     */
    public static void main(String[] args) {
        String input = "madam";


        String front = "";
        for (int i = 0; i < input.length(); i++) {
            front += input.charAt(i); // add each character
        }
        System.out.println("Front collected: " + front);


        String reverse = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reverse += input.charAt(i);
        }

        System.out.println("Reverse collected: " +reverse);
        if (reverse.equals(front)) {
            System.out.println("Palindrome");}
        else
            System.out.println("Not Palindrome");





        }
        }




