package es.fbenavente.palindromevalidator.ensure;

import es.fbenavente.palindromevalidator.exception.CustomExceptionFactory;

public class Ensure {

    private Ensure() {

    }

    public static <T extends Exception> void ensureThatArrayLengthIsGreaterOrEqualThan(
            String[] array,
            int expectedSize,
            String message,
            Class<T> exceptionClass) throws T {
        int currentSize = array != null ? array.length : 0;
        if (currentSize < expectedSize) {
            throw CustomExceptionFactory.instanceOf(exceptionClass, message);
        }
    }
}
