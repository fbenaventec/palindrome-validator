package es.fbenavente.palindromevalidator;

public class BasicPalindromeValidator implements PalindromeValidator {
    @Override
    public boolean isPalindrome(String text) {
        if (text == null || text.isEmpty()) {
            return true;
        }
        char [] chars = text.toCharArray();
        char [] normalizedChars = normalize(chars);
        for (int i = 0, j = normalizedChars.length - 1; i < normalizedChars.length; i++, j--) {
            if (normalizedChars[i] != normalizedChars[j]) {
                return false;
            }
        }
        return true;
    }

    private char [] normalize(char [] chars) {
        char[] normalized = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            normalized[i] = Character.toLowerCase(chars[i]);
        }
        return normalized;
    }
}
