package es.fbenavente.palindromevalidator.commandline;

import es.fbenavente.palindromevalidator.PalindromeValidator;
import es.fbenavente.palindromevalidator.PalindromeValidatorProvider;
import es.fbenavente.palindromevalidator.domain.PalindromeImplementation;
import es.fbenavente.palindromevalidator.exception.ArgumentException;

import static es.fbenavente.palindromevalidator.ensure.Ensure.ensureThatArrayLengthIsGreaterOrEqualThan;
import static es.fbenavente.palindromevalidator.exception.ErrorCatalog.ARGUMENTS_MISSING;

public class PalindromeValidatorCommandLine {
    @SuppressWarnings("squid:S106")
    public static void main(String ... args) throws ArgumentException {
        ensureThatArrayLengthIsGreaterOrEqualThan(args, 2, ARGUMENTS_MISSING, ArgumentException.class);
        PalindromeImplementation palindromeImplementation = PalindromeImplementation.valueOf(args[0]);
        PalindromeValidator palindromeValidator = PalindromeValidatorProvider.instanceOf(palindromeImplementation);
        System.out.println(palindromeValidator.isPalindrome(String.join(" ", args[1])));
    }
}
