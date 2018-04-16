package alg;

/**
 * Description:
 * Write a program to reverse a number using numeric operations. Below example shows how to reverse a number using numeric operations.
 */
public class ReverseNumber {
    public static void main(String... args) {
        System.out.println(reverseNumber(19834));
    }

    private static int reverseNumber(int pNumber) {
        int reverse = 0;
        while (pNumber != 0) {
            reverse = reverse * 10 + pNumber % 10;
            pNumber = pNumber / 10;
        }
        return reverse;
    }
}
