package es.fbenavente.palindromevalidator.commandline;

public class PalindromeValidatorCommandLine {
    public static void main(String ... args) {
        PalindromeValidatorCommandLine palindromeValidator = new PalindromeValidatorCommandLine();
        System.out.println(palindromeValidator.isPalindrome(String.join(" ", args)));
    }

    public boolean isPalindrome(String text) {
        if (text == null) {
            return true;
        }
        String reverseText = reverse(text);
        return reverseText.equalsIgnoreCase(text);
    }

    private String reverse(String text) {
        StringBuilder stringBuilder = new StringBuilder(text);
        return stringBuilder.reverse().toString();
    }
}
