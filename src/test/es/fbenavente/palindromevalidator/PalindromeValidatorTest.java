package es.fbenavente.palindromevalidator;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class PalindromeValidatorTest {

    @Test
    public void when_the_string_is_null_should_return_true() {
        PalindromeValidator palindromeValidator = new PalindromeValidator();

        boolean isValid = palindromeValidator.isPalindrome(null);

        assertThat(isValid, is(true));
    }

    @Test
    public void when_the_string_is_empty_should_return_true() {
        PalindromeValidator palindromeValidator = new PalindromeValidator();

        boolean isValid = palindromeValidator.isPalindrome("");

        assertThat(isValid, is(true));
    }

    @Test
    public void when_the_string_is_equal_to_the_reverse_string_should_return_true() {
        PalindromeValidator palindromeValidator = new PalindromeValidator();

        boolean isValid = palindromeValidator.isPalindrome("abba");

        assertThat(isValid, is(true));
    }

    @Test
    public void when_the_string_is_not_equal_to_the_reverse_string_should_return_false() {
        PalindromeValidator palindromeValidator = new PalindromeValidator();

        boolean isValid = palindromeValidator.isPalindrome("abbb");

        assertThat(isValid, is(false));
    }

    @Test
    public void when_string_is_equals_to_the_reverse_string_but_contains_differences_by_case_should_return_true() {
        PalindromeValidator palindromeValidator = new PalindromeValidator();

        boolean isValid = palindromeValidator.isPalindrome("abBA");

        assertThat(isValid, is(true));
    }
}
