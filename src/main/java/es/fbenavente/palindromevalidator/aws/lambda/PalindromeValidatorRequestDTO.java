package es.fbenavente.palindromevalidator.aws.lambda;

import lombok.Data;

@Data
public class PalindromeValidatorRequestDTO {
    private String method;
    private String text;
}
