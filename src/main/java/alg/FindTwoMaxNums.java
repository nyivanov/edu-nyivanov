package alg;

/**
 * Description:
 * Write a program to find top two maximum numbers in the
 * given array. You should not use any sorting functions. You
 * should iterate the array only once. You should not use any
 * kind of collections in java.
 */
public class FindTwoMaxNums {
    private static void findTwoMaxNums(final int[] pNums) {
        int max = Integer.MIN_VALUE;
        int secondToMax = Integer.MIN_VALUE;

        for (int pNum : pNums) {
            if (pNum >= max) {
                secondToMax = max;
                max = pNum;
            } else if (pNum >= secondToMax) {
                secondToMax = pNum;
            }
        }

        System.out.println(max);
        System.out.println(secondToMax);
    }

    public static void main(String... args) {
        final int[] nums = {776, 1, 4, 5, 87, 999, 45, 23, 67, 777};
        findTwoMaxNums(nums);
    }
}
