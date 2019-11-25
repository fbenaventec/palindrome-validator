package es.fbenavente.palindromevalidator;

import es.fbenavente.palindromevalidator.domain.PalindromeImplementation;

public class PalindromeValidatorProvider {
    private PalindromeValidatorProvider() {

    }

    public static PalindromeValidator instanceOf(PalindromeImplementation palindromeImplementation) {
        if (palindromeImplementation == PalindromeImplementation.SIMPLE) {
            return new SimplePalindromeValidator();
        } else {
            return new BasicPalindromeValidator();
        }
    }
}
