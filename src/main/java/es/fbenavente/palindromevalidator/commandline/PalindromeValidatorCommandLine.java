package es.fbenavente.palindromevalidator.commandline;

import es.fbenavente.palindromevalidator.PalindromeValidator;

public class PalindromeValidatorCommandLine {
    @SuppressWarnings("squid:S106")
    public static void main(String ... args) {
        PalindromeValidator palindromeValidator = new PalindromeValidator();
        System.out.println(palindromeValidator.isPalindrome(String.join(" ", args)));
    }
}
