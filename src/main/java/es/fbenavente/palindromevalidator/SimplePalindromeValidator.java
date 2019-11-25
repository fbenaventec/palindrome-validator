package es.fbenavente.palindromevalidator;

public class SimplePalindromeValidator implements PalindromeValidator {
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
