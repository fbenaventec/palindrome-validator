package es.fbenavente.palindromevalidator;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class PalindromeValidatorTest {

    @Test
    public void when_the_string_is_equal_to_the_reverse_string_should_return_true() {
        PalindromeValidator palindromeValidator = new PalindromeValidator();

        boolean isValid = palindromeValidator.isAPalindrome("abba");

        assertThat(isValid, is(true));
    }
}
