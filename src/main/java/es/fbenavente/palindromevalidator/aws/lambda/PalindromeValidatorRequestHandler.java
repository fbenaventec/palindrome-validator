package es.fbenavente.palindromevalidator;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class PalindromeValidatorRequestHandler implements RequestHandler<String, Boolean> {
    private final PalindromeValidator palindromeValidator = new PalindromeValidator();

    @Override
    public Boolean handleRequest(String text, Context context) {
        return palindromeValidator.isPalindrome(text);
    }
}
