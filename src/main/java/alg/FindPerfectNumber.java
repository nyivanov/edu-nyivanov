package alg;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Description:
 * A perfect number is a positive integer that is equal to the sum
 * of its proper positive divisors, that is, the sum of its positive
 * divisors excluding the number itself. Equivalently, a perfect number
 * is a number that is half the sum of all of its positive divisors.
 * The first perfect number is 6, because 1, 2 and 3 are its proper
 * positive divisors, and 1 + 2 + 3 = 6. Equivalently, the number 6
 * is equal to half the sum of all its positive divisors:
 * ( 1 + 2 + 3 + 6 ) / 2 = 6.
 */
public class FindPerfectNumber {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        System.out.println(isPerfectNum(scanner.nextInt()));
    }

    private static boolean isPerfectNum(final int pNumber) {
        final List<Integer> properDivisors = findProperDivisors(pNumber);
        return properDivisors.stream().mapToInt(Integer::intValue).sum() == pNumber;
    }

    private static List<Integer> findProperDivisors(final int pNumber) {
        final List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i < pNumber; i++) {
            if (pNumber % i == 0) {
                divisors.add(i);
            }
        }
        return divisors;
    }
}
