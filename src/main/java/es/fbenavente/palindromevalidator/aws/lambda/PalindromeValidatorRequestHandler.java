package es.fbenavente.palindromevalidator.aws.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import es.fbenavente.palindromevalidator.PalindromeValidator;
import es.fbenavente.palindromevalidator.PalindromeValidatorProvider;
import es.fbenavente.palindromevalidator.domain.PalindromeImplementation;

public class PalindromeValidatorRequestHandler implements RequestHandler<PalindromeValidatorRequestDTO, Boolean> {

    @Override
    public Boolean handleRequest(PalindromeValidatorRequestDTO request, Context context) {
        PalindromeImplementation palindromeImplementation = PalindromeImplementation.valueOf(request.getMethod());
        PalindromeValidator palindromeValidator = PalindromeValidatorProvider.instanceOf(palindromeImplementation);
        return palindromeValidator.isPalindrome(request.getText());
    }
}
