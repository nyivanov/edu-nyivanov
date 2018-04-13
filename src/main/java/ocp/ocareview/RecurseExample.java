package ocp.ocareview;

import java.util.stream.StreamSupport;

public class RecurseExample {

    public static void main(final String... pArgs) {
        final String input = "abcdef134";
        System.out.println(reverseString(input));

        final int numbersToSum = 5;
        int sum = 0;
        for (int i = 0; i < numbersToSum; i++) {
            sum += findFibNumber(i);
        }
        System.out.println(sum);
    }

    private static String reverseString(final String pInput) {
        if (pInput == null || pInput.length() == 0) {
            return pInput;
        }
        return pInput.substring(pInput.length() - 1) + reverseString(pInput.substring(0, pInput.length() - 1));
    }

    private static int findFibNumber(final int pCount) {
        if (pCount == 0 || pCount == 1) {
            return pCount;
        }
        return findFibNumber(pCount - 1) + findFibNumber(pCount - 2);
    }
}
