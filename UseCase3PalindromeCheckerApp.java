public class UseCase3PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "level";
        String reversed = "";

        // reverse the string
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        // compare original and reversed
        if (input.equals(reversed)) {
            System.out.println(input + " is a Palindrome");
        } else {
            System.out.println(input + " is Not a Palindrome");
        }

    }
}