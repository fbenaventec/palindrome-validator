package es.fbenavente.palindromevalidator;

public class PalindromeValidator {
    public boolean isPalindrome(String text) {
        if (text == null) {
            return true;
        }
        String textIgnoringCase = text.toLowerCase();
        char[] chars = textIgnoringCase.toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            char c1 = chars[i];
            char c2 = chars[(chars.length -i)- 1];
            if (c1 != c2) {
                return false;
            }
        }
        return true;
    }
}
