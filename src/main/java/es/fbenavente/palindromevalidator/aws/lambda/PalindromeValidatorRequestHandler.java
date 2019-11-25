package es.fbenavente.palindromevalidator.aws.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import es.fbenavente.palindromevalidator.PalindromeValidator;

public class PalindromeValidatorRequestHandler implements RequestHandler<String, Boolean> {
    private final PalindromeValidator palindromeValidator = new PalindromeValidator();

    @Override
    public Boolean handleRequest(String text, Context context) {
        return palindromeValidator.isPalindrome(text);
    }
}
